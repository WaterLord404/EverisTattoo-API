package com.everis.tattoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.tattoo.model.entity.Product;
import com.everis.tattoo.model.repository.ProductRepositoryI;

@Service
public class ProductServiceImpl implements ProductServiceI {

	/** Instancia del repostorio ed producto */
	@Autowired
	private ProductRepositoryI productRepository;

	@Override
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(final Long id) {

		return productRepository.findById(id).get();
	}

	@Override
	public Product addProduct(final Product product) {
		productRepository.save(product);
		return product;
	}

	@Override
	public Product deleteProductById(final Long id) {
		Product product = productRepository.findById(id).get();
		productRepository.deleteById(id);
		return product;
	}

	/*
	 * 
	 * @Override public List<Product> getProductByCategory(final String category) {
	 * 
	 * return productRepository.findByCategory(category); 
	 * 
	 * }
	 * 
	 * @Override public void updProduct(final Product product) {
	 * 
	 * productRepository.save(product);
	}
	 * 
	 */

}
