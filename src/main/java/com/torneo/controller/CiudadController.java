package com.torneo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torneo.model.Ciudad;
import com.torneo.service.ICiudadService;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {
	
	@Autowired
	private ICiudadService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Ciudad>> listar(){
		List<Ciudad> ciudad = new ArrayList<>();
		ciudad = service.listar();
		return new ResponseEntity<List<Ciudad>>(ciudad, HttpStatus.OK);
	}
}
