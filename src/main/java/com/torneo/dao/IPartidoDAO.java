package com.torneo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torneo.model.Partido;

public interface IPartidoDAO extends JpaRepository<Partido, Integer>{

}
