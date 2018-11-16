package com.torneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.IJugadorVisitanteDAO;
import com.torneo.model.JugadorVisitante;
import com.torneo.service.IJugadorVisitanteService;

@Service
public class JugadorVisitanteServiceImpl implements IJugadorVisitanteService{

	@Autowired
	private IJugadorVisitanteDAO dao;

	@Override
	public JugadorVisitante registrar(JugadorVisitante t) {
		return dao.save(t);
	}

	@Override
	public JugadorVisitante modificar(JugadorVisitante t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public JugadorVisitante listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<JugadorVisitante> listar() {
		return dao.findAll();
	}
	
	

}
