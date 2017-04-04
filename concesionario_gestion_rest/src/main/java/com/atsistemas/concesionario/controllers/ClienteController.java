package com.atsistemas.concesionario.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/ClienteGestion", 
				consumes={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
				produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class ClienteController {
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<String> getClientes(){
		return new ResponseEntity<String>("hola",HttpStatus.ACCEPTED);
	}
}
