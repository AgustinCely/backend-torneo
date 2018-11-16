package com.torneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.IInscripcionDAO;
import com.torneo.model.Inscripcion;
import com.torneo.service.IInscripcionService;

@Service
public class InscripcionServiceImpl implements IInscripcionService{

	@Autowired
	private IInscripcionDAO dao;
	
	@Override
	public Inscripcion registrar(Inscripcion t) {
		return dao.save(t);
	}

	@Override
	public Inscripcion modificar(Inscripcion t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Inscripcion listarId(int id) {
		return dao.findOne(id);			
	}

	@Override
	public List<Inscripcion> listar() {
		return dao.findAll();
	}
	
}
