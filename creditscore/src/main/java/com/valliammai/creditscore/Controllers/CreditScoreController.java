package com.valliammai.creditscore.Controllers;

import com.valliammai.creditscore.model.CreditScore;
import com.valliammai.creditscore.repos.CreditScoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditScoreController {
    @Autowired
    CreditScoreRepo repo;
    @GetMapping("/creditscores/{pan}")
    public int getCreditScore(@PathVariable("pan") String pan){
        return repo.findById(pan).get().getScore();

    }
}
