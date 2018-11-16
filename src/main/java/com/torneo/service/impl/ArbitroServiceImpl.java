package com.torneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.dao.IArbitroDAO;
import com.torneo.model.Arbitro;
import com.torneo.service.IArbitroService;

@Service
public class ArbitroServiceImpl implements IArbitroService{

	@Autowired
	private IArbitroDAO dao;
	
	@Override
	public Arbitro registrar(Arbitro t) {
		return dao.save(t);
	}

	@Override
	public Arbitro modificar(Arbitro t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);;
	}

	@Override
	public Arbitro listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Arbitro> listar() {
		return dao.findAll();
	}

}
