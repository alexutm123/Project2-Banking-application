package com.example.SpringTest2.AccountControler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringTest2.DTO.PaymentRequestDTO;
import com.example.SpringTest2.Service.PayService;

@RestController
public class PayController {
    
	private final PayService payService;
    
	@Autowired
	public PayController(PayService payService) {
		super();
		this.payService = payService;
	}
	@PostMapping("/pay")
	public Object pay(@RequestBody PaymentRequestDTO dto)
	{
		return payService.pay(dto.getAccountId(), dto.getAmount());
	}
	
	@PostMapping("/payDolg")
	public Object payMentDolg(@RequestBody PaymentRequestDTO dto)
	{
		return payService.updateDolg(dto.getAccountId(),dto.getPayMentDolg());
	}
	
	@PostMapping("/addDepozit")
	public Object updateDepozit(@RequestBody PaymentRequestDTO dto)
	{
		return payService.updateDepozit(dto.getAccountId(),dto.getAmount());
	}
	
}
