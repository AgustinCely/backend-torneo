package com.torneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.IRondaDAO;
import com.torneo.model.Ronda;
import com.torneo.service.IRondaService;

@Service
public class RondaServiceImpl implements IRondaService{

	@Autowired
	private IRondaDAO dao;
	
	@Override
	public Ronda registrar(Ronda t) {
		return dao.save(t);
	}

	@Override
	public Ronda modificar(Ronda t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Ronda listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Ronda> listar() {
		return dao.findAll();
	}

}
