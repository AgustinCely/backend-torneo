package com.torneo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torneo.model.Director;

public interface IDirectorDAO extends JpaRepository<Director, Integer>{

}
