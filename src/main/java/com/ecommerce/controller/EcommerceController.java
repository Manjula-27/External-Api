package com.ecommerce.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.dto.ResultDto;

@RestController
@RequestMapping("/external")
public class EcommerceController {
	
	@Autowired
	RestTemplate res;
	
	@GetMapping("/getProductInfo")
	public ResponseEntity<ResultDto> fetchProducts(@RequestParam(name="Id") String shopperId){
		
		 Map<String, String> params = new HashMap<String, String>();
		 params.put("Id", shopperId);
		 ResponseEntity<ResultDto> response =res.getForEntity("http://localhost:8080/productApi/getProducts?Id={Id}", ResultDto.class, params);
		 return response;
		
	}

}
