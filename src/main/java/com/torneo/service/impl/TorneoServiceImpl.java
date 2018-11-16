package com.torneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.ITorneoDAO;
import com.torneo.model.Torneo;
import com.torneo.service.ITorneoService;

@Service
public class TorneoServiceImpl implements ITorneoService{

	@Autowired
	private ITorneoDAO dao;
	
	@Override
	public Torneo registrar(Torneo t) {
		return dao.save(t);
	}

	@Override
	public Torneo modificar(Torneo t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Torneo listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Torneo> listar() {		
		return dao.findAll();
	}
	
}
