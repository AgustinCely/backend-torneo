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

import com.torneo.model.JugadorVisitante;
import com.torneo.service.IJugadorVisitanteService;

@RestController
@RequestMapping("/jugadorvisitante")
public class JugadorVisitanteController {

	@Autowired
	private IJugadorVisitanteService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<JugadorVisitante>> listar(){
		List<JugadorVisitante> jugadorvi = new ArrayList<>();
		jugadorvi = service.listar();
		return new ResponseEntity<List<JugadorVisitante>>(jugadorvi, HttpStatus.OK);
	}
}
