package com.example.Banking.BankingSystem.repository;

import com.example.Banking.BankingSystem.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
