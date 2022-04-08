package com.alexandre.mainionic.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.alexandre.mainionic.domain.Client;
import com.alexandre.mainionic.services.validation.ClientUpdate;

@ClientUpdate
public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message="Preenchimento do campo nome é obrigatório!")
	@Length(min=2, max=120, message="O tamanho do nome do cliente deve"
			+ " ter entre 2 e 120 caracteres!")
	private String name;
	
	@NotEmpty(message="Preenchimento do campo e-mail é obrigatório!")
	@Email(message="Email inválido!")
	private String email;

	public ClientDTO() {}

	public ClientDTO(Client obj) {
		this.id = obj.getId();
		this.name = obj.getName();
		this.email = obj.getEmail();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
