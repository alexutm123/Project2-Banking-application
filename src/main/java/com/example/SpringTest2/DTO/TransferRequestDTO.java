package com.example.SpringTest2.DTO;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransferRequestDTO {
	
    @JsonProperty("account_id_from")
	public Long accountIdFrom;
    
    @JsonProperty("account_id_to")
	public Long accountIdTo;
    
    public Long getAccountIdFrom() {
		return accountIdFrom;
	}

	public void setAccountIdFrom(Long accountIdFrom) {
		this.accountIdFrom = accountIdFrom;
	}

	public Long getAccountIdTo() {
		return accountIdTo;
	}

	public void setAccountIdTo(Long accountIdTo) {
		this.accountIdTo = accountIdTo;
	}

	public BigDecimal getDecimal() {
		return decimal;
	}

	public void setDecimal(BigDecimal decimal) {
		this.decimal = decimal;
	}

	@JsonProperty("decimal")
	public BigDecimal decimal;
	
	
}
