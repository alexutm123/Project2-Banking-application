package com.example.SpringTest2.DTO;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentRequestDTO {
    
	@JsonProperty("account_id")
	private Long accountId;
	
	@JsonProperty("amount")
	private BigDecimal amount;
	
	@JsonProperty("payMentDolg")
	private String payMentDolg;
	

	public String getPayMentDolg() {
		return payMentDolg;
	}

	public void setPayMentDolg(String payMentDolg) {
		this.payMentDolg = payMentDolg;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
}
