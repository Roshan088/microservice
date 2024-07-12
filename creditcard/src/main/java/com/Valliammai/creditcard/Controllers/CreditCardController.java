package com.Valliammai.creditcard.Controllers;

import com.Valliammai.creditcard.dto.CreditCardReq;
import com.Valliammai.creditcard.dto.CreditScore;
import com.Valliammai.creditcard.dto.PanIdentity;
import com.Valliammai.creditcard.model.CreditCard;
import com.Valliammai.creditcard.repos.CreditCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CreditCardController {
    @Autowired
    private CreditCardRepo repo;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/issuecard")
    public String issuecard(@RequestBody CreditCard card){
        if (verifyPan(new PanIdentity(card.getPan(),card.getFirst_name(),card.getLast_name()))){
            if (getScore(card.getPan())>=700){
                repo.save(card);
                return("Credit card successfully created for the below customer: \n"+card.toString());
            }
        }
        return "Credit card not eligible for this customer";
    }

    private int getScore(String pan) {
        return restTemplate.getForObject("http://creditscore-app:9092/creditscores/"+ pan,Integer.class);

    }

    private boolean verifyPan(PanIdentity panIdentity) {
        return restTemplate.postForObject("http://identity-app:9091/identitycheck/verify",panIdentity,Boolean.class);

    }
}
