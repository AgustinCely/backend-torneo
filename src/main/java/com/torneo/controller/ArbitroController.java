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

import com.torneo.model.Arbitro;
import com.torneo.service.IArbitroService;

@RestController
@RequestMapping("/arbitro")
public class ArbitroController {

	@Autowired
	private IArbitroService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Arbitro>> listar(){
		List<Arbitro> arbitro = new ArrayList<>();
		arbitro = service.listar();
		return new ResponseEntity<List<Arbitro>>(arbitro, HttpStatus.OK);
	}
}
