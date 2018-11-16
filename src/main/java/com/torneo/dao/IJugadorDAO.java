package com.torneo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torneo.model.JugadorLocal;

public interface IJugadorDAO  extends JpaRepository<JugadorLocal, Integer>{

}
