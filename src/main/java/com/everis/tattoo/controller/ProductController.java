package com.everis.tattoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.tattoo.model.entity.Product;
import com.everis.tattoo.service.ProductServiceI;

@RestController
@RequestMapping(path = "/EverisTattoo")
@CrossOrigin(origins = "*")
public class ProductController {

	@Autowired
	private ProductServiceI productService;

	/* Obtiene los productos */
	@GetMapping
	public ResponseEntity<?> getAllProducts() {
		
		return !productService.getAllProducts().isEmpty()
				? ResponseEntity.ok(productService.getAllProducts())
				: ResponseEntity.notFound().build();
	}

	/* Obtiene un producto */
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getProduct(@PathVariable Long id) {
		
		return productService.getProduct(id) != null
				? ResponseEntity.ok(productService.getProduct(id)) 
				: ResponseEntity.notFound().build();
	}

	/* Añade un producto */
	@PostMapping
	public ResponseEntity<?> addProduct(@RequestBody Product sentProduct) {
		
		Product product = productService.getProduct(sentProduct.getId());
		
		return product != null 
				? ResponseEntity.status(HttpStatus.CREATED).body(product) 
				: ResponseEntity.status(HttpStatus.CONFLICT).body(product);
	}
	
	/* Borra un producto */
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
		
		return productService.getProduct(id) != null 
				? ResponseEntity.ok(productService.deleteProductById(id)) 
				: ResponseEntity.notFound().build();
	}
}
