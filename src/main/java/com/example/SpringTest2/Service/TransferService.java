package com.example.SpringTest2.Service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.SpringTest2.entity.Account;
import com.example.SpringTest2.entity.Bill;
import com.example.SpringTest2.exceptions.NotDefaultBillExeptions;

import com.example.SpringTest2.Utils.AccountUtils;

@Service
public class TransferService {
	private final AccountService accountService;
    @Autowired
	public TransferService(AccountService accountService) {

		this.accountService = accountService;
	}
	
	public Object transfer(Long accountIdFrom,Long accountIdTo,BigDecimal amount)
	{
		Account accountFrom=accountService.getById(accountIdFrom);
		Account accountTo=accountService.getById(accountIdTo);
		Bill billFrom=AccountUtils.findDefaultBill(accountFrom);
		Bill billTo=AccountUtils.findDefaultBill(accountTo);
		billFrom.setAmount(billFrom.getAmount().subtract(amount));
		billTo.setAmount(billTo.getAmount().add(amount));
		accountService.updateAccount(accountFrom);
		accountService.updateAccount(accountTo);
		return "Succes";
	}

	

}
