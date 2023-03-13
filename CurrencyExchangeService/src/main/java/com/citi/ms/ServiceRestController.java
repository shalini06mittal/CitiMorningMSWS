package com.citi.ms;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

// exposes class as a REST API
@RestController
public class ServiceRestController {

	
	//@Autowired
	private RestTemplate template;
	
	// exposes REST API over HTTP GET method
	@GetMapping("exchange/from/{from}/to/{to}/qty/{qty}")
	public CurrencyValue calculateMultiple (@PathVariable String from,
			@PathVariable String to,@PathVariable int  qty){	
		// /forex/from/{from}/to/{to}
		
		/**
		 * 1. communicate with other services => template [creation]
		 * 2. IP addr = port number [ hardcoded ]
		 * 3. so many services => communicate [ locate or discover ]
		 * 
		 * Discovery server - Eureka [ health, making them available ]
		 * unique id
		 */
		
		RestTemplate template = new RestTemplate();

		
		CurrencyValue cv =  template.getForObject("http://ms1/forex/from/{from}/to/{to}",
				CurrencyValue.class, from, to);
		cv.setConversionValue(cv.getMultiple().multiply(new BigDecimal(qty)));
		return cv;
	}
	
}
