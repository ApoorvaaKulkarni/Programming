package com.example.Banking.BankingSystem.controller;


import com.example.Banking.BankingSystem.DTO.AccountDto;
import com.example.Banking.BankingSystem.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //Add Account Rest
    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    //Get Account Rest api
    public ResponseEntity<AccountDto> getAccountbyId(@PathVariable Long id){
        AccountDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);

    }
    //deposit rest api
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id,@RequestBody Map<String,Double> request){
        Double amount = request.get("amount");
        AccountDto accountDto = accountService.deposit(id,request.get("amount"));
        return ResponseEntity.ok(accountDto);
    }

    //withdraw rest api
    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id, @RequestBody Map<String,Double> request){
        double amount = request.get("amount");
        AccountDto accountDto = accountService.withdraw(id,amount);
        return  ResponseEntity.ok(accountDto);
    }
    //get all account rest Api
    @GetMapping

    public ResponseEntity<List<AccountDto>> getAllAccounts(){
        List<AccountDto> accounts = accountService.getAllAccount();
        return ResponseEntity.ok(accounts);
    }
    //delete account rest api
    @DeleteMapping("/{id}/delete")
    public  ResponseEntity<String> deleteAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
        return ResponseEntity.ok("Account is deleted successfully!");

    }

}
