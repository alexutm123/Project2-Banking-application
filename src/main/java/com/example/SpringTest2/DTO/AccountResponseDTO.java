package com.example.SpringTest2.DTO;

import java.util.List;
import java.util.stream.Collectors;

import com.example.SpringTest2.entity.Account;




public class AccountResponseDTO {
	
	
	    
		private Long accountId;
	    
	  
	    private String name;
	    
	   
	    private String email;
	    
	    private List<BillResponseDTO> bills;
	    
	    public AccountResponseDTO (Account account) {
	     accountId=account.getAccountId();
	     name=account.getName();	
	     email=account.getEmail();
	     bills=account.getBills().stream()
	    		 .map(BillResponseDTO::new)// Преобразуем каждый объект Bill в BillResponseDTO
	    		 .collect(Collectors.toList());// Собираем результаты в список
	    		 
	    		
		} 


		public AccountResponseDTO (Long accountId, String name, String email, List<BillResponseDTO> bills) {
			super();
			this.accountId = accountId;
			this.name = name;
			this.email = email;
			this.bills = bills;
		}


		public Long getAccountId() {
			return accountId;
		}


		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public List<BillResponseDTO> getBills() {
			return bills;
		}


		public void setBills(List<BillResponseDTO> bills) {
			this.bills = bills;
		}


		
}
