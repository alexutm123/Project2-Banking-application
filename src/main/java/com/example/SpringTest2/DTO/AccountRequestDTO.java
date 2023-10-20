package com.example.SpringTest2.DTO;

import java.util.List;

public class AccountRequestDTO {

    public AccountRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountRequestDTO(List<BillRequestDTO> bills) {
		super();
		this.bills = bills;
	}

	private String name;

    private String email;
    
    private int dolg; 
    
    public int getDolg() {
		return dolg;
	}

	private List<BillRequestDTO> bills;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<BillRequestDTO> getBills() {
        return bills;
    }
}
