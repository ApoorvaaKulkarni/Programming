package com.example.Banking.BankingSystem.service.impl;


import com.example.Banking.BankingSystem.DTO.AccountDto;
import com.example.Banking.BankingSystem.entity.Account;
import com.example.Banking.BankingSystem.mapper.Accountmapper;
import com.example.Banking.BankingSystem.repository.AccountRepository;
import com.example.Banking.BankingSystem.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceimpl implements AccountService {
    private AccountRepository accountRepository;


    public AccountServiceimpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = Accountmapper.mapToAccount(accountDto);
        Account savedAccount= accountRepository.save(account);
        return Accountmapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
       Account account= accountRepository.
               findById(id).
               orElseThrow(() -> new RuntimeException("Acccount does not exists"));
       return  Accountmapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id, double amount) {
        Account account= accountRepository.
                findById(id).
                orElseThrow(() -> new RuntimeException("Acccount does not exists"));
        double total = account.getBalance() + amount;
        account.setBalance(total);
        Account savedAccount = accountRepository.save(account);

        return Accountmapper.mapToAccountDto(savedAccount  );
    }

    @Override
    public AccountDto withdraw(Long id, double amount) {
        Account account= accountRepository.
                findById(id).
                orElseThrow(() -> new RuntimeException("Acccount does not exists"));
        if(account.getBalance() < amount){
            throw  new RuntimeException("Insufficient amount");
        }
        double total = account.getBalance()-amount;
        account.setBalance(total);
        Account savedAccount = accountRepository.save(account);

        return Accountmapper.mapToAccountDto(savedAccount);
    }

    @Override
    public List<AccountDto> getAllAccount() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream().map((account -> Accountmapper.mapToAccountDto(account)))
                .collect(Collectors.toList());

    }

    @Override
    public void deleteAccount(Long id) {
        Account account= accountRepository.
                findById(id).
                orElseThrow(() -> new RuntimeException("Acccount does not exists"));
        accountRepository.deleteById(id);

    }


}
