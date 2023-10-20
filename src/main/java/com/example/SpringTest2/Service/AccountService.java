package com.example.SpringTest2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringTest2.AccountRepozitory.AccountRep;
import com.example.SpringTest2.AccountRepozitory.BillRepozitory;
import com.example.SpringTest2.entity.Account;
import com.example.SpringTest2.entity.Bill;
import com.example.SpringTest2.exceptions.ExeptionsAccaunt;
import com.example.SpringTest2.exceptions.NotDefaultBillExeptions;


@Service
public class AccountService {

    private final AccountRep repozit;
	
    private final BillRepozitory billRepozitory;
	@Autowired
	public AccountService(AccountRep repozit,BillRepozitory billRepozitory) {
	    this.billRepozitory=billRepozitory;
		this.repozit = repozit;
	}
	
	public Long save(String name ,String email, List<Bill> bills,int dolg)
	{
		Account account = new Account(name,email,dolg,bills);
		
		return repozit.save(account).getAccountId();
	}
	
	 public Account getById(Long accountId) {
	        return repozit.findById(accountId)
	        		.orElseThrow(() -> new ExeptionsAccaunt("Can't find account with id: " + accountId));
	    }
	 
	 public List<Account> getAll() { 
		    return repozit.findAll();
		}
	 
	 
	 public String deleteById(Long id) {
		    repozit.deleteById(id);
		    return "Succes";
		}
	 
	 
	 public Account updateAccount(Account update) {
			Account account = update;
		    return repozit.save(account);
	 }	 
	 
	 
	 
	 
	 
}

