package com.example.Banking.BankingSystem.mapper;


import com.example.Banking.BankingSystem.DTO.AccountDto;
import com.example.Banking.BankingSystem.entity.Account;

public class Accountmapper {
    public static Account mapToAccount(AccountDto accountDto){
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
                );
        return accountDto;
    }
}
