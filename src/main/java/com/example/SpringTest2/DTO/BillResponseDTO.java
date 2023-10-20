package com.example.SpringTest2.DTO;

import java.math.BigDecimal;

import com.example.SpringTest2.entity.Bill;

public class BillResponseDTO {
	private Long IdBill;
    
	private BigDecimal amount;
	    
	private boolean isDefault;

	public BillResponseDTO(Long idBill, BigDecimal amount, boolean isDefault) {
	
		this.IdBill = idBill;
		this.amount = amount;
		this.isDefault = isDefault;
	}

	public BillResponseDTO(Bill bill) {
     IdBill=bill.getBillId();
     amount=bill.getAmount();
     isDefault=bill.getDefault();
	}

	public Long getIdBill() {
		return IdBill;
	}

	public void setIdBill(Long idBill) {
		IdBill = idBill;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	} 
	
	
}
