package com.everis.tattoo.service;

import java.util.List;

import com.everis.tattoo.model.entity.Product;

public interface ProductServiceI {
	
	/**
	 * Devuelve todos los productos existentes
	 * 
	 * @return List<Product>
	 */
	public List<Product> getAllProducts();
	
	/**
	 * Obtiene un producto mediante su id
	 * 
	 * @param id
	 * @return Product
	 */
	public Product getProduct(final Long id);
	
	/**
	 * añade un producto
	 * 
	 * @param product
	 */
	public Product addProduct(final Product sentProduct);
	
	/**
	 * Elimina un producto existente
	 * 
	 * @param id
	 */
	public Product deleteProductById(final Long id);
	

	/**
	 * Obtiene productos mediante su categoria
	 * 
	 * @param category
	 * @return List<Product>
	 */
//	public List<Product> getProductByCategory(final String category);


	/**
	 * Actualiza datos de un producto existente
	 * 
	 * @param product
	 */
//	public void updProduct(final Product product); 

}
