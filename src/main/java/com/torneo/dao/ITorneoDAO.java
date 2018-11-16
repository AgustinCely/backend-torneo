package com.torneo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torneo.model.Torneo;

public interface ITorneoDAO extends JpaRepository<Torneo, Integer>{

}
