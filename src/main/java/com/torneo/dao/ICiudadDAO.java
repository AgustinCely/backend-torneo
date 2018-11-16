package com.torneo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torneo.model.Ciudad;

public interface ICiudadDAO extends JpaRepository<Ciudad, Integer>{

}
