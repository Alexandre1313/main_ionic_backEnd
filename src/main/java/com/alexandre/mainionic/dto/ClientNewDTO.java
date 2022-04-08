package com.alexandre.mainionic.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.alexandre.mainionic.services.validation.ClientCreate;

@ClientCreate
public class ClientNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="Preenchimento do campo nome é obrigatório!")
	@Length(min=2, max=120, message="O tamanho do nome do cliente deve"
			+ " ter entre 2 e 120 caracteres!")
	private String name;
	
	@NotEmpty(message="Preenchimento do campo e-mail é obrigatório!")
	@Email(message="Email inválido!")
	private String email;
	
	@NotEmpty(message="Preenchimento do campo CPF/CNPJ é obrigatório!")
	private String cpfCnpj;
	
	private Integer type;
	
	@NotEmpty(message="Preenchimento do campo rua é obrigatório!")
	private String street;
	
	@NotEmpty(message="Preenchimento do campo número é obrigatório!")
	private String number;
	
	private String complement;
	
	@NotEmpty(message="Preenchimento do campo bairro é obrigatório!")
	private String district;
	
	@NotEmpty(message="Preenchimento do campo cep é obrigatório!")
	private String cep;
	
	@NotEmpty(message="Preenchimento do campo telefone 1 é obrigatório!")
	private String phone1;
	
	private String phone2;
	
	private String phone3;
	
	private Integer city_id;
	
	public ClientNewDTO() {}

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

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public Integer getCity_id() {
		return city_id;
	}

	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}
	
}
