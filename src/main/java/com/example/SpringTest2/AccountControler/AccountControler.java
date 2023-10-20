package com.example.SpringTest2.AccountControler;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringTest2.DTO.AccountRequestDTO;
import com.example.SpringTest2.DTO.AccountResponseDTO;
import com.example.SpringTest2.Service.AccountService;
import com.example.SpringTest2.entity.Account;
import com.example.SpringTest2.entity.Bill;

@RestController
public class AccountControler {
  

	private final AccountService accountService;
    @Autowired
	public AccountControler(AccountService accountService) {

		this.accountService = accountService;
	}

    @GetMapping("/accounts/{accountId}")
    public AccountResponseDTO getById(@PathVariable Long accountId) {
        return new AccountResponseDTO(accountService.getById(accountId));
    }

    @PostMapping("/accounts")
    public Long create(@RequestBody AccountRequestDTO accountRequestDTO) {
        return accountService.save(accountRequestDTO.getName(),
                accountRequestDTO.getEmail(), accountRequestDTO.getBills().stream()
                        .map(billRequestDTO -> new Bill(billRequestDTO.getAmount(), billRequestDTO.getDefault(),billRequestDTO.getRepaymentOfADebt()))
                        .collect(Collectors.toList()),accountRequestDTO.getDolg());
    }
	@GetMapping("/getAll")
    public List<Account> FindAll()
    {
    	return accountService.getAll();
    }
	@DeleteMapping("/delete/{accountId}")
    public String delete(@PathVariable Long accountId )
    {
		return accountService.deleteById(accountId);
    }
    @PutMapping("/ubdate/{accountId}")
	public ResponseEntity<Account> update(@PathVariable Long accountId ,@RequestBody AccountRequestDTO account)
	{
    	 Account existingAccount = accountService.getById(accountId);
         if (existingAccount == null) {
             return ResponseEntity.notFound().build();
         }
         existingAccount.setEmail(account.getEmail());
         existingAccount.setName(account.getName());
         existingAccount.setDolg(account.getDolg());
         Account savedAccount = accountService.updateAccount(existingAccount);
         return ResponseEntity.ok(savedAccount);
	}
   
	


	
	
	
	
	
	
	
	
	
}
