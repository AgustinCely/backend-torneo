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

import com.torneo.model.Cancha;
import com.torneo.service.ICanchaService;

@RestController
@RequestMapping("/cancha")
public class CanchaController {

	@Autowired
	private ICanchaService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Cancha>> listar(){
		List<Cancha> cancha = new ArrayList<>();
		cancha = service.listar();
		return new ResponseEntity<List<Cancha>>(cancha, HttpStatus.OK);
	}
}
