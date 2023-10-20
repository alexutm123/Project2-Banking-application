package com.example.SpringTest2.entity;




import java.math.BigDecimal;
import java.util.StringJoiner;

import com.example.SpringTest2.DTO.BillRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billId;

    private BigDecimal amount;

    private String repaymentOfADebt;
    
    private Boolean isDefault;

    public Bill(BigDecimal amount, Boolean isDefault,String repaymentOfADebt) {
        this.amount = amount;
        this.isDefault = isDefault;
        this.repaymentOfADebt=repaymentOfADebt;
    }

    public Bill(String repaymentOfADebt) {
		super();
		this.repaymentOfADebt = repaymentOfADebt;
	}

	public String getRepaymentOfADebt() {
		return repaymentOfADebt;
	}

	public void setRepaymentOfADebt(String repaymentOfADebt) {
		this.repaymentOfADebt = repaymentOfADebt;
	}

	public Bill(BillRequestDTO billRequestDTO) {
        amount = billRequestDTO.getAmount();
        isDefault = billRequestDTO.getDefault();
    }

    public Bill() {
    }

    public Long getBillId() {
        return billId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bill.class.getSimpleName() + "[", "]")
                .add("billId=" + billId)
                .add("amount=" + amount)
                .add("isDefault=" + isDefault)
                .toString();
    }
}

