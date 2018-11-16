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

import com.torneo.model.Premio;
import com.torneo.service.IPremioService;

@RestController
@RequestMapping("/premio")
public class PremioController {

	@Autowired
	private IPremioService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Premio>> listar(){
		List<Premio> premio = new ArrayList<>();
		premio = service.listar();
		return new ResponseEntity<List<Premio>>(premio, HttpStatus.OK);
	}
}
