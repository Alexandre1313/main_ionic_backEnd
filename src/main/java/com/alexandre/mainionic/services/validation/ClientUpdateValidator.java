package com.alexandre.mainionic.services.validation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerMapping;

import com.alexandre.mainionic.dto.ClientDTO;
import com.alexandre.mainionic.repositories.ClientRepository;
import com.alexandre.mainionic.resources.exceptions.FieldMessage;

public class ClientUpdateValidator implements ConstraintValidator<ClientUpdate, ClientDTO> {
	
	 @Autowired
	 private ClientRepository crepo;
	 
	 @Autowired
	 private HttpServletRequest request;
	
	 @Override
	 public void initialize(ClientUpdate ann) {
	 }
	 @Override
	 public boolean isValid(ClientDTO objDTO, ConstraintValidatorContext context) {
		 
		 @SuppressWarnings("unchecked")
		 Map<String, String> map = (Map<String, String>) request.
				 getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
		 
		 Integer uriId = Integer.parseInt(map.get("id"));
		 
		 List<FieldMessage> list = new ArrayList<>();
		 
		 if(crepo.findByEmail(objDTO.getEmail()) != null && 
				 !crepo.findByEmail(objDTO.getEmail()).getId().equals(uriId)) {
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
