package com.torneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.ICanchaDAO;
import com.torneo.model.Cancha;
import com.torneo.service.ICanchaService;

@Service
public class CanchaServiceImpl implements ICanchaService{

	@Autowired
	private ICanchaDAO dao;
	
	@Override
	public Cancha registrar(Cancha t) {		
		return dao.save(t);
	}

	@Override
	public Cancha modificar(Cancha t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Cancha listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Cancha> listar() {	
		return dao.findAll();
	}

}
