package com.example.demo.services;

import com.example.demo.Deposit;
import com.example.demo.repos.DepositRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepositService {

    private DepositRepo depositRepo;

    @Autowired
    public DepositService(DepositRepo depositRepo){this.depositRepo = depositRepo;}

    public Deposit create(Deposit deposit){
       deposit = depositRepo.save(deposit);
       return deposit;
        }

    public Deposit find(Long id){
        Optional<Deposit> depositOptional = DepositRepo.findById(id);
        return depositOptional.get();
    }

    public Iterable<Deposit> findAll(){
        Iterable<Deposit> deposits = depositRepo.findAll();
        return deposits;
    }

    public Deposit update(Deposit deposit){
        deposit = depositRepo.save(deposit);
        return deposit;
    }

    public void delete(Long id){
        Deposit deposit = find(id);
        depositRepo.delete(deposit);
    }


}
