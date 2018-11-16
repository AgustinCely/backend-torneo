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

import com.torneo.model.Ronda;
import com.torneo.service.IRondaService;

@RestController
@RequestMapping("/ronda")
public class RondaController {

	@Autowired
	private IRondaService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Ronda>> listar(){
		List<Ronda> ronda = new ArrayList<>();
		ronda = service.listar();
		return new ResponseEntity<List<Ronda>>(ronda, HttpStatus.OK);
	}
}
