package com.torneo.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.torneo.model.Inscripcion;
import com.torneo.service.IInscripcionService;

@RestController
@RequestMapping("/inscripciones")
public class InscripcionesController {

	@Autowired
	private IInscripcionService service;
	
	 @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<List<Inscripcion>> listar(){
			List<Inscripcion> inscripciones = new ArrayList<>();
			inscripciones = service.listar();
			return new ResponseEntity<List<Inscripcion>>(inscripciones, HttpStatus.OK);
		}
	 
	 @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Object> registrar(@Valid @RequestBody Inscripcion inscripcion){
		 
		 Inscripcion ins = new Inscripcion();
		 ins = service.registrar(inscripcion);
		 URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(ins.getIdinscripcion()).toUri();
		 return ResponseEntity.created(location).build();
	 }
}
