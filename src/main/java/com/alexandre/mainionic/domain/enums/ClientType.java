package com.alexandre.mainionic.domain.enums;

public enum ClientType {
	
	PESSOAFISICA(1, "Pessoa física"), PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private Integer code;
	private String description;
	
	private ClientType(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
	public static ClientType toEnum(Integer code) {
		if(code == null) {
			return null;
		}
		for(ClientType c: ClientType.values()) {
			if(code.equals(c.getCode())) {}
				return c;
		}
		throw new IllegalArgumentException("Tipo de cliente com ID: " 
		+ code + " é inválido");
	}
	
}
