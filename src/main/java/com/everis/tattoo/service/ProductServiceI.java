package com.everis.tattoo.service;

import java.util.List;

public interface ProductServiceI {

	public List<Product> getAllProducts();
	
	public Product getProduct(final Long id);
	
	public Product addProduct(final Product product);
	
	public Product deleteProductById(final Long id);
}
