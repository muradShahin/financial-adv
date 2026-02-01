package mtech.demo.financialadv.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mtech.demo.financialadv.dto.Account;
import mtech.demo.financialadv.dto.Card;
import mtech.demo.financialadv.dto.Deposits;
import mtech.demo.financialadv.dto.Loan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("api")
public class Controller {


    @GetMapping("/v1/accounts/{nationalId}")
    public ResponseEntity<?> getAccountsByNID(String nid){

        var listOfAccounts = new ArrayList<Account>();
        listOfAccounts.add(new Account(1,"Saving","saving account","123456789","Capital Bank","JO00EFG1123222","890.00"));
        listOfAccounts.add(new Account(2,"Saving","saving account","123456789","Arab Bank","AB00EFG11232222","220.00"));
        listOfAccounts.add(new Account(3,"Regular","regular account","123456789","Arab Bank","AB00EFG1123244","190.00"));
        listOfAccounts.add(new Account(4,"Deposit","deposit account","123456789","Etihad Bank","ET00EFG1123222","4430.00"));


        return new ResponseEntity<>(listOfAccounts, HttpStatus.OK);

    }


    @GetMapping("/v1/deposits/{nationalId}")
    public ResponseEntity<?> getDeposits(String nid){
        var listOfDepsits = new ArrayList<Deposits>();
        listOfDepsits.add(new Deposits(13, "5000","5.4","2030/10/10","Capital Bank","JOXXAS2231234"));
        listOfDepsits.add(new Deposits(14, "3000","5.4","2028/01/30","Arab Bank","ABXXAS22312555"));
        listOfDepsits.add(new Deposits(15, "6000","5.4","2032/02/02","Etihad Bank","JetXACCS223189912"));

        return new ResponseEntity<>(listOfDepsits,HttpStatus.OK);

    }

    @GetMapping("/v1/loans/{nationalId}")
    public ResponseEntity<?> getLoans(String ni){
        var listOfLoans= new ArrayList<Loan>();
        listOfLoans.add(new Loan(554,"15000","250","5.5","2030/01/01","200","Car Loan","Arab Bank","ABXXAS223125999"));
        listOfLoans.add(new Loan(5561,"100000","250","5.5","2050/01/01","700","Housing Loan","Arab Bank","ABXXAS223125126"));

        return new ResponseEntity<>(listOfLoans,HttpStatus.OK);
    }

    @GetMapping("/v1/cards/{nationalId}")
    public ResponseEntity<?> getCards(String nid){
        var listOfCards = new ArrayList<Card>();
        listOfCards.add(new Card("1234 3545 6565 3234","Capital Bank","Visa-Debit","450","100","489","09/28"));
        listOfCards.add(new Card("5534 8741 6551 9961","Arab Bank Bank","Visa-Credit","1450","450","281","07/30"));


        return new ResponseEntity<>(listOfCards,HttpStatus.OK);
    }



}
