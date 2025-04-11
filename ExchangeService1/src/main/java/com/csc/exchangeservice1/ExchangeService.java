package com.csc.exchangeservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
	@Transactional
	public class ExchangeService {
	    
	    @Autowired
	    private ExchangeRepository repo;

	    public void insertRecord(Exchange exchange) {
	        repo.save(exchange);
	    }
}
