package com.citi.ms.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.citi.ms.entity.ExchangeValue;
import com.citi.ms.repo.ExchangevalueRepo;

@RestController
public class ForexRestController {

	@Autowired
	private ExchangevalueRepo repo;
	
	@GetMapping("/forex/from/{from}/to/{to}")
	public ExchangeValue getConversionMultiple(
			@PathVariable String from,
			@PathVariable String to)
	{
		
		return repo.findByFromAndTo(from, to);
		//return  null;
	}
}
