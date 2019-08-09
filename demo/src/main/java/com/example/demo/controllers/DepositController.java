package com.example.demo.controllers;

import com.example.demo.Deposit;
import com.example.demo.services.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


    @RestController
    public class DepositController {

        private DepositService depositService;

        @Autowired
        public DepositController(com.example.demo.services.DepositService depositService){
            this.depositService = depositService;
        }

        @GetMapping("/accounts/{accountid}/deposit")
        public ResponseEntity<Iterable<Deposit>> getAll(){
            Iterable<Deposit> deposit = depositService.findAll();
            ResponseEntity<Iterable<Deposit>> responseEntity = new ResponseEntity<>(deposit, HttpStatus.OK);
            return responseEntity;
        }

        @PostMapping("/accounts/{accountid}/deposits")
        public ResponseEntity<Deposit> post(@RequestBody Deposit deposit){
            deposit = DepositService.create(deposit);
            return new ResponseEntity<>(deposit, HttpStatus.CREATED);
        }


        @GetMapping("/deposits/{{id}")
        public ResponseEntity<Deposit> get(@PathVariable("id") Long id){
           Deposit deposit = DepositService.find(id);
            return new ResponseEntity<>(deposit, HttpStatus.OK);
        }

        @PutMapping("/deposits/{id}")
        public ResponseEntity<Deposit> put(@PathVariable("id") Long id, @RequestBody Deposit deposit){
            deposit = depositService.update(deposit);
            return new ResponseEntity<>(deposit, HttpStatus.ACCEPTED);
        }



        @DeleteMapping("/deposits/{depositid}")
        public ResponseEntity<Deposit> delete(@PathVariable("id") Long id){
            depositService.delete(id);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }


    }

