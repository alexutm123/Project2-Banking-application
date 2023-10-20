package com.example.SpringTest2.Utils;

import com.example.SpringTest2.entity.Account;
import com.example.SpringTest2.entity.Bill;
import com.example.SpringTest2.exceptions.NotDefaultBillExeptions;

public class AccountUtils {
	
	public static Bill findDefaultBill(Account accountFrom)
	{
		return accountFrom.getBills()
				.stream()
				.filter(Bill::getDefault )
				.findAny()
			    .orElseThrow(()->new NotDefaultBillExeptions("Error"+accountFrom.getAccountId()));
	}
}
