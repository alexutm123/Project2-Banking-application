package com.example.SpringTest2.AccountControler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.SpringTest2.DTO.TransferRequestDTO;
import com.example.SpringTest2.Service.TransferService;

@RestController
public class TransferController {
	
	private final TransferService service;
	

	@Autowired
    public TransferController(TransferService service) {
		
		this.service = service;
	}

    @PostMapping("/transfers")
	public Object transfer(@RequestBody TransferRequestDTO dto) {
	
	return service.transfer(dto.accountIdFrom, dto.accountIdTo, dto.decimal);
	
	}
	
  
}
