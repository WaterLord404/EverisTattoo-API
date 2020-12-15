package com.everis.tattoo.service;

import java.util.List;

import com.everis.tattoo.model.entity.Product;

public interface ProductServiceI {

	/**
	 * Returns a list of all products.
	 * 
	 * @return List<Product>
	 */
	public List<Product> getAllProducts();

	/**
	 * Returns a product by Id.
	 * 
	 * @param id
	 * @return Product
	 */
	public Product getProduct(final Long id);

	/**
	 * Adds a product.
	 * 
	 * @param product
	 * @return Product
	 */
	public Product addProduct(final Product product);

	/**
	 * Deletes a product by Id.
	 * 
	 * @param id
	 * @return
	 */
	public Product deleteProductById(final Long id);
}
