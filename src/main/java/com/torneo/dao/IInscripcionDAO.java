package com.torneo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torneo.model.Inscripcion;

public interface IInscripcionDAO extends JpaRepository<Inscripcion, Integer>{

}
