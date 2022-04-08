package com.alexandre.mainionic.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class OrderItems implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@EmbeddedId
	private OrderItemsPK id = new OrderItemsPK();
	
	private Double discount;
	private Integer quantity;
	private Double price;
	
	public OrderItems() {}

	public OrderItems(Request request, Product product, Double discount,
			Integer quantity, Double price) {
		super();
		id.setProduct(product);
		id.setRequest(request);
		this.discount = discount;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Double getTotalSub() {
		return (price - discount) * quantity;
	}

	public OrderItemsPK getId() {
		return id;
	}

	public void setId(OrderItemsPK id) {
		this.id = id;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@JsonIgnore
	public Request getRequest() {
		return id.getRequest();
	}
	
	public Product getProduct() {
		return id.getProduct();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItems other = (OrderItems) obj;
		return Objects.equals(id, other.id);
	}
	
}
