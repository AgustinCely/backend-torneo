package com.torneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.torneo.dao.IPartidoDAO;
import com.torneo.model.Partido;
import com.torneo.service.IPartidoService;

@Service
public class PartidoServiceImpl implements IPartidoService{

	@Autowired
	private IPartidoDAO dao;
	
	@Override
	public Partido registrar(Partido p) {
		return dao.save(p);
	}

	@Override
	public Partido modificar(Partido t) {	
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Partido listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Partido> listar() {
		return dao.findAll();
	}

	@Override
	public Page<Partido> listarPageable(Pageable pageable) {
		return dao.findAll(pageable);
	}
}
