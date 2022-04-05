package com.alexandre.mainionic.domain;

public class OrderItems {

	private OrderItemsPK id = new OrderItemsPK();
	private Double discount;
	private Integer quantity;
	private Double price;
	
	public OrderItems() {}

	public OrderItems(OrderItemsPK id, Double discount, Integer quantity, Double price) {
		super();
		this.id = id;
		this.discount = discount;
		this.quantity = quantity;
		this.price = price;
	}
	
	
}
