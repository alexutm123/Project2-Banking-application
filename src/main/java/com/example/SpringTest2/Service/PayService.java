package com.example.SpringTest2.Service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringTest2.entity.Account;
import com.example.SpringTest2.entity.Bill;

import utils.AccountUtils;

@Service
public class PayService {
	
	private final AccountService accountService;
	
	@Autowired
    public PayService(AccountService accountService) {
		
		this.accountService = accountService;
	}

	public Object pay(Long accountId,BigDecimal amount)
    {
	Account account=accountService.getById(accountId);
    Bill defaultBill=AccountUtils.findDefaultBill(account);
	defaultBill.setAmount(defaultBill.getAmount().subtract(amount));
	accountService.updateAccount(account);
	return "Succes";
    }
	
	public Object updateDolg(Long accountId,String payment)
    {
	Account account=accountService.getById(accountId);
    Bill defaultBill=AccountUtils.findDefaultBill(account);
	defaultBill.setRepaymentOfADebt(payment);
	accountService.updateAccount(account);
	return "Succes";
    }
	
	public Object updateDepozit(Long accountId,BigDecimal amount)
    {
	Account account=accountService.getById(accountId);
    Bill defaultBill=AccountUtils.findDefaultBill(account);
	defaultBill.setAmount(defaultBill.getAmount().add(amount));
	accountService.updateAccount(account);
	return "Succes";
    }
}
