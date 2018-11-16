package com.torneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.IDirectorDAO;
import com.torneo.model.Director;
import com.torneo.service.IDirectorSerivce;

@Service
public class DirectorSericeImpl implements IDirectorSerivce{

	@Autowired
	private IDirectorDAO dao;
	
	@Override
	public Director registrar(Director t) {
		return dao.save(t);
	}

	@Override
	public Director modificar(Director t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Director listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Director> listar() {
		return dao.findAll();
	}
	
}
