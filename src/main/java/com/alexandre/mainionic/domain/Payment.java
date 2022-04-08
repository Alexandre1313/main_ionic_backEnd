package com.alexandre.mainionic.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.alexandre.mainionic.domain.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	private Integer paymentStatus;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="request_id")
	@MapsId
	private Request request;
	
	public Payment() {}

	public Payment(Integer id, PaymentStatus paymentStatus, Request request) {
		super();
		this.id = id;
		this.paymentStatus = (paymentStatus == null) ? null: paymentStatus.getCode();
		this.request = request;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PaymentStatus getPaymentStatus() {
		return PaymentStatus.toEnum(paymentStatus);
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus.getCode();
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
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
		Payment other = (Payment) obj;
		return Objects.equals(id, other.id);
	}
	
}
