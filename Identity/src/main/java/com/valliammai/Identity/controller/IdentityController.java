package com.valliammai.Identity.controller;

import com.valliammai.Identity.model.PanIdentity;
import com.valliammai.Identity.repo.IdentityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentityController {

    @Autowired
    private IdentityRepo repo;

    @PostMapping("/identitycheck/verify")
    public boolean verifyPan(@RequestBody PanIdentity panIdentity){
        PanIdentity panIdentity1=repo.findById(panIdentity.getPan()).get();
        if(panIdentity.getPan().equalsIgnoreCase(panIdentity1.getPan())
                && panIdentity.getFirst_name().equalsIgnoreCase(panIdentity1.getFirst_name())
                && panIdentity.getLast_name().equalsIgnoreCase(panIdentity1.getLast_name())
        ){
            return true;
        }

        return false;
    }
}
