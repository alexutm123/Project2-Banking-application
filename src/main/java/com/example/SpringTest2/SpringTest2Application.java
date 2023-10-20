package com.example.SpringTest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Create an application that will create an Account with user parameters and Bill 
//
//Account will contain the following fields: accountId, name, email,dolg, list Bill
//
//Bill will contain the following fields: billId, BigDecimal amount, boolean isDefault,repaymentOfADebt.
//
// It will also need to be able to accept Payment and Deposit payments,changes in debt percentage
//
// And realize the method of transferring money from one Account to another (Transfer) in a separate controller.

@SpringBootApplication
public class SpringTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringTest2Application.class, args);
	}

}
