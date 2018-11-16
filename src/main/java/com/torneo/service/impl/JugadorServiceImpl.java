package com.torneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.IJugadorDAO;
import com.torneo.model.JugadorLocal;
import com.torneo.service.IJugadorService;

@Service
public class JugadorServiceImpl implements IJugadorService{

	@Autowired
	private IJugadorDAO dao;
	
	@Override
	public JugadorLocal registrar(JugadorLocal t) {
		return dao.save(t);
	}

	@Override
	public JugadorLocal modificar(JugadorLocal t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public JugadorLocal listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<JugadorLocal> listar() {
		return dao.findAll();
	}

}
