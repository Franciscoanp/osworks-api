package com.algaworks.osworks.core;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

	//necessario criar esse bean para o spring conseguir gerenciar e injetar como dependencia
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
