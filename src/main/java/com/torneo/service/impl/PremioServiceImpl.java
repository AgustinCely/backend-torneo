package com.torneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.IPremioDAO;
import com.torneo.model.Premio;
import com.torneo.service.IPremioService;

@Service
public class PremioServiceImpl implements IPremioService{

	@Autowired
	private IPremioDAO dao;
	
	@Override
	public Premio registrar(Premio t) {
		return dao.save(t);
	}

	@Override
	public Premio modificar(Premio t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Premio listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Premio> listar() {
		return dao.findAll();
	}

}
