package com.example.Banking.BankingSystem.service;


import com.example.Banking.BankingSystem.DTO.AccountDto;
import com.example.Banking.BankingSystem.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id, double amount);
    AccountDto withdraw(Long id,double amount);
    List<AccountDto> getAllAccount();



    void deleteAccount(Long id);
}
