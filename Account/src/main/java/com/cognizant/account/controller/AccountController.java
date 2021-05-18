package com.cognizant.account.controller;

import com.cognizant.account.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account accountDetails(@PathVariable String number) {
        Account ac = new Account();
        ac.setNumber(number);
        ac.setBalance(475893);
        ac.setType("saving");
        return ac;
    }


}
