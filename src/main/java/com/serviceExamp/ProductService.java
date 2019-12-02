package com.serviceExamp;

import org.springframework.stereotype.Service;

import com.ProductDtExamps.ProductDto;

@Service
public class ProductService {

	public ProductDto giveDemoProduct() {
		ProductDto p = new ProductDto();
		p.setName("Samsung");
		p.setCategory("Phone & Tablets");
		p.setDescription("This is the new Samsung");
		return p;

	}
}
