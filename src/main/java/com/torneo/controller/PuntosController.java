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

import com.torneo.model.Puntos;
import com.torneo.service.IPuntosService;

@RestController
@RequestMapping("/puntos")
public class PuntosController {

	@Autowired
	private IPuntosService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Puntos>> listar(){
		List<Puntos> puntos = new ArrayList<>();
		puntos = service.listar();
		return new ResponseEntity<List<Puntos>>(puntos, HttpStatus.OK);
	}
}
