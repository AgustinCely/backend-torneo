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

import com.torneo.model.Torneo;
import com.torneo.service.ITorneoService;

@RestController
@RequestMapping("/torneo")
public class TorneoController {
	
	 @Autowired
	 private ITorneoService service;
	 
	 @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<List<Torneo>> listar(){
			List<Torneo> torneo = new ArrayList<>();
			torneo = service.listar();
			return new ResponseEntity<List<Torneo>>(torneo, HttpStatus.OK);
		}
	 
	 @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Object> registrar(@Valid @RequestBody Torneo torneo){
		 
		 Torneo tor = new Torneo();
		 tor = service.registrar(torneo);
		 URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(tor.getIdTorneo()).toUri();
		 return ResponseEntity.created(location).build();		 
	 }
	 
	 
}
