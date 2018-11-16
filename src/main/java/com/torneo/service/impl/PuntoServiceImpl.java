package com.torneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.IPuntosDAO;
import com.torneo.model.Puntos;
import com.torneo.service.IPuntosService;

@Service
public class PuntoServiceImpl implements IPuntosService{

	@Autowired
	private IPuntosDAO dao;
	
	@Override
	public Puntos registrar(Puntos t) {
		return dao.save(t);
	}

	@Override
	public Puntos modificar(Puntos t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Puntos listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Puntos> listar() {
		return dao.findAll();
	}

}
