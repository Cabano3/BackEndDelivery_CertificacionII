package com.bano.backend.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bano.backend.models.entities.Product;
import com.bano.backend.services.interfaces.IProductService;
import com.bano.backend.utils.ResponseUtility;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private IProductService service;

	@GetMapping("/{id}")
	private Product retrive(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Product> list(){
		return service.findAll();
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Product create(@RequestBody Product product) {
		service.save(product);
		return product;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Product update(@RequestBody Product product, @PathVariable Long id) {
		service.save(product);
		return product;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	@GetMapping("/search/state/{state}")
	public List<Product> listByState(@PathVariable String state) {
		return service.findByState(state);
	}
	
	@GetMapping("/search/name/{name}")	
	public ResponseEntity<?> listByLastName(@PathVariable String name) {
		try {
			List<Product> st = service.searchByName(name);
			if(st.size() == 0) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not product found");	
			}
			return ResponseEntity.ok(st);
		}
		catch(Exception ex) {
			return new ResponseEntity<ResponseUtility>(new ResponseUtility(ex.getMessage(), ex), HttpStatus.BAD_REQUEST);
		}
	}
}
