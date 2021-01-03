package com.bano.backend.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import com.bano.backend.models.entities.OrderDetail;
import com.bano.backend.services.interfaces.IOrderDetailService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/orderdetail")
public class OrderDetailController {

	@Autowired
	private IOrderDetailService service;

	@GetMapping("/{id}")
	private OrderDetail retrive(@PathVariable(value="id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<OrderDetail> list(){
		return service.findAll();
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public OrderDetail create(@RequestBody OrderDetail orderdetail) {
		service.save(orderdetail);
		return orderdetail;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public OrderDetail update(@RequestBody OrderDetail orderdetail, @PathVariable Long id) {
		service.save(orderdetail);
		return orderdetail;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}


