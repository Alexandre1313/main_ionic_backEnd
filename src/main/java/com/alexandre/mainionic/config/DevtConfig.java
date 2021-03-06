package com.alexandre.mainionic.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alexandre.mainionic.services.DBService;

@Configuration
@Profile("dev")
public class DevtConfig {
	
	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instantiateDB() throws ParseException {
		if(!"create".equals(strategy)) {
			return false;
		}
		this.dbService.instantiateDB();
		return true;
	}

}
