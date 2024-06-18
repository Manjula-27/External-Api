package com.ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ProductDto {
	
	@JsonIgnore
	 private String brand;

	@JsonIgnore
	 private String category;

	private String productId;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}
