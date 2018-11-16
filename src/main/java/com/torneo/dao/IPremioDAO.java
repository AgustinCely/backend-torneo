package com.torneo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torneo.model.Premio;

public interface IPremioDAO extends JpaRepository<Premio, Integer>{

}
