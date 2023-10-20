package com.example.SpringTest2.DTO;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BillRequestDTO {

    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonProperty("isDefault")
    private Boolean isDefault;

    @JsonProperty("repaymentOfADebt")
    private String repaymentOfADebt;
    
    public BigDecimal getAmount() {
        return amount;
    }

  

	public BillRequestDTO( Boolean isDefault) {
	
		this.isDefault = isDefault;
	}

    public String getRepaymentOfADebt() {
		return repaymentOfADebt;
	}

	public Boolean getDefault() {
        return isDefault;
    }

    public BillRequestDTO() {
    	

	}
}
