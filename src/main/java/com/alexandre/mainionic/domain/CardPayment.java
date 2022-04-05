package com.alexandre.mainionic.domain;

import javax.persistence.Entity;

import com.alexandre.mainionic.domain.enums.PaymentStatus;

@Entity
public class CardPayment extends Payment{
	private static final long serialVersionUID = 1L;
	
	private Integer amountOfInstallment;

	public CardPayment() {}

	public CardPayment(Integer id, PaymentStatus paymentStatus, 
			Request request, Integer amountOfInstallment) {
		super(id, paymentStatus, request);
		this.amountOfInstallment = amountOfInstallment;
	}

	public Integer getAmountOfInstallment() {
		return amountOfInstallment;
	}

	public void setAmountOfInstallment(Integer amountOfInstallment) {
		this.amountOfInstallment = amountOfInstallment;
	}
	
}
