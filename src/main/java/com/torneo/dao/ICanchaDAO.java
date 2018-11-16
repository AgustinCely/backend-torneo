package com.torneo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torneo.model.Cancha;


public interface ICanchaDAO extends JpaRepository<Cancha, Integer>{

}
