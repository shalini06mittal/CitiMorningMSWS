package com.techgatha.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techgatha.model.OrderWrapper;
import com.techgatha.model.UserCatalog;
import com.techgatha.model.UserCatalogDTO;

@FeignClient(name="BOOK-SERVICE")
public interface BookFeignClient {

	
	@RequestMapping("/books/{bookid}")
	public UserCatalog getBookDetails( @PathVariable String bookid);
	
	@RequestMapping("/books/{bookid}")
	public UserCatalogDTO getBookDetailsDTO( @PathVariable String bookid);
}
