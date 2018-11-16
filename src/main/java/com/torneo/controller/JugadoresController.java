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

import com.torneo.model.JugadorLocal;
import com.torneo.service.IJugadorService;

@RestController
@RequestMapping("/jugador")
public class JugadoresController {

	@Autowired
	private IJugadorService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<JugadorLocal>> listar(){
		List<JugadorLocal> jugador = new ArrayList<>();
		jugador = service.listar();
		return new ResponseEntity<List<JugadorLocal>>(jugador, HttpStatus.OK);
	}
}
