package com.example.demo.repos;
import com.example.demo.Deposit;
import org.springframework.data.repository.CrudRepository;

public interface DepositRepo extends CrudRepository<Deposit, Long> {
}

