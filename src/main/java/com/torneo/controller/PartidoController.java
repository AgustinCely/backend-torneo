package com.torneo.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.torneo.exception.ModeloNotFoundException;
import com.torneo.model.Partido;
import com.torneo.service.IPartidoService;

@RestController
@RequestMapping("/partido")
public class PartidoController {
	
	@Autowired
	private IPartidoService service;
	
	 @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<List<Partido>> listar(){
			List<Partido> partido = new ArrayList<>();
			partido = service.listar();
			return new ResponseEntity<List<Partido>>(partido, HttpStatus.OK);
		}
	 
	 @GetMapping(value="/pageable", produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Page<Partido>> listarPageable(Pageable pageable){
			Page<Partido> partido;
			partido = service.listarPageable(pageable);
			return new ResponseEntity<Page<Partido>>(partido, HttpStatus.OK);
		}
	 
	 @GetMapping(value = "/{id}")
		public Resource<Partido> listarId(@PathVariable("id") Integer id) {
		 Partido part = service.listarId(id);
			if (part == null) {
				throw new ModeloNotFoundException("ID: " + id);
			}
			
			Resource<Partido> resource = new Resource<Partido>(part);
			ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).listarId(id));
			resource.add(linkTo.withRel("partido-resource"));
			
			return resource;
		}
	 
	 @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<Object> registrar(@Valid @RequestBody Partido partido){
		 
		 Partido part = new Partido();
		 part = service.registrar(partido);
		 URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(part.getIdpartido()).toUri();
		 return ResponseEntity.created(location).build();
	 }
	 
	 @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Object> actualizar(@Valid @RequestBody Partido partido) {		
			service.modificar(partido);
			return new ResponseEntity<Object>(HttpStatus.OK);
		}
}
