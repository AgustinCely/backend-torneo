package com.torneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.ICiudadDAO;
import com.torneo.model.Ciudad;
import com.torneo.service.ICiudadService;

@Service
public class CiudadServiceImpl implements ICiudadService{

	@Autowired
	private ICiudadDAO dao;
	
	@Override
	public Ciudad registrar(Ciudad t) {
		return dao.save(t);
	}

	@Override
	public Ciudad modificar(Ciudad t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Ciudad listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Ciudad> listar() {
		return dao.findAll();
	}

}
