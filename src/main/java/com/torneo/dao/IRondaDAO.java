package com.torneo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torneo.model.Ronda;

public interface IRondaDAO extends JpaRepository<Ronda, Integer>{

}
