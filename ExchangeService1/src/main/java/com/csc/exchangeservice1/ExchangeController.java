package com.csc.exchangeservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {

	
	
	 @Autowired
	    private ExchangeService service;

	    @PostMapping("/exchangeservice")
	    public void inserting(@RequestBody Exchange exchange) {
	        service.insertRecord(exchange);
	    }
}
