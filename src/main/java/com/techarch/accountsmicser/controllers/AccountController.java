package com.techarch.accountsmicser.controllers;

import com.techarch.accountsmicser.models.Accounts;
import com.techarch.accountsmicser.services.AccountServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountServiceImpl accountService;
    private static final Logger logger = LogManager.getLogger(AccountController.class);

    @GetMapping("/accounts/{userId}")
public ResponseEntity<List<Accounts>> getAccountsByUserId(@PathVariable Long userId) {

        //logger.error("In the Account Controller");
    List<Accounts> accounts = accountService.getAccountsByUserId(userId);
    return new ResponseEntity<>(accounts, HttpStatus.OK);
}
    @PostMapping("/accounts")
    public ResponseEntity<Accounts> createUser(@RequestBody Accounts account) {

        return new ResponseEntity<>(accountService.createAccount(account), HttpStatus.CREATED);

    }

}
