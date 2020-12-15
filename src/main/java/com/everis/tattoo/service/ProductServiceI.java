package com.everis.tattoo.service;

import java.util.List;

import com.everis.tattoo.model.entity.Product;

public interface ProductServiceI {

	public List<Product> getAllProducts();
	
	public Product getProduct(final Long id);
	
	public Product addProduct(final Product product);
	
	public Product deleteProductById(final Long id);
}
