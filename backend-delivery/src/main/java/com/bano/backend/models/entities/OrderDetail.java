package com.bano.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Table(name="OrdersDetails")
@Entity
public class OrderDetail implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_orderdetail")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idOrderDetail;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="subtotal")
	private double subtotal;

	public OrderDetail() {
		super();

	}
	public OrderDetail(Long idOrderDetail) {
		super();
		this.idOrderDetail = idOrderDetail;
	}
	
	@JoinColumn(name="fk_product", referencedColumnName="id_product")
	@ManyToOne
	private Product product;
	
	@JoinColumn(name="fk_order", referencedColumnName="id_order")
	@ManyToOne
	private Order order;
	
	
	
	public Long getIdOrderDetail() {
		return idOrderDetail;
	}
	public void setIdOrderDetail(Long idOrderDetail) {
		this.idOrderDetail = idOrderDetail;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	

	
}
