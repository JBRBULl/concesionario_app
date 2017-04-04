package com.atsistemas.concesionario;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScans(
		@ComponentScan("com.atsistemas.concesionario.controllers")
)
@EnableWebMvc
public class ConfigurationWeb {

	
}
