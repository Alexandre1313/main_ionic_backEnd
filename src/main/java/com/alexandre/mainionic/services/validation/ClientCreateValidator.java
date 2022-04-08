package com.alexandre.mainionic.services.validation;
import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.alexandre.mainionic.domain.enums.ClientType;
import com.alexandre.mainionic.dto.ClientNewDTO;
import com.alexandre.mainionic.repositories.ClientRepository;
import com.alexandre.mainionic.resources.exceptions.FieldMessage;
import com.alexandre.mainionic.services.validation.utils.ValidatorCpfCnpj;

public class ClientCreateValidator implements ConstraintValidator<ClientCreate, ClientNewDTO> {
	
	 @Autowired
	 private ClientRepository crepo;
	
	 @Override
	 public void initialize(ClientCreate ann) {
	 }
	 @Override
	 public boolean isValid(ClientNewDTO objDTO, ConstraintValidatorContext context) {
	 List<FieldMessage> list = new ArrayList<>();
	 
	 if(objDTO.getType().equals(ClientType.PESSOAFISICA.getCode()) && 
			 !ValidatorCpfCnpj.isValidCPF(objDTO.getCpfCnpj())) {
		 list.add(new FieldMessage("cpfCnpj", "CPF inválido!"));
	 }
	 
	 if(objDTO.getType().equals(ClientType.PESSOAJURIDICA.getCode()) && 
			 !ValidatorCpfCnpj.isValidCNPJ(objDTO.getCpfCnpj())) {
		 list.add(new FieldMessage("cpfCnpj", "CNPJ inválido!"));
	 }
	 	 
	 if(crepo.findByEmail(objDTO.getEmail()) != null) {
		 list.add(new FieldMessage("email", "Email já cadastrado no banco de dados!"));
	 }
	 
	 for (FieldMessage e : list) {
	 context.disableDefaultConstraintViolation();
	 context.buildConstraintViolationWithTemplate(e.getMessage())
	 .addPropertyNode(e.getFieldName()).addConstraintViolation();
	 }
	 return list.isEmpty();
	 }
	}
