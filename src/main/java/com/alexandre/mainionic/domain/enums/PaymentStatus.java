package com.alexandre.mainionic.domain.enums;

public enum PaymentStatus {
	
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private Integer code;
	private String description;
	
	private PaymentStatus(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
	public static PaymentStatus toEnum(Integer code) {
		if(code == null) {
			return null;
		}
		for(PaymentStatus p: PaymentStatus.values()) {
			if(code.equals(p.getCode())) {}
				return p;
		}
		throw new IllegalArgumentException("Situação de pagamento com ID: " 
		+ code + " é inválido");
	}
}
