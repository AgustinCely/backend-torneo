package com.torneo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.torneo.model.Partido;

public interface IPartidoService extends ICRUD<Partido>{

	Page<Partido> listarPageable(Pageable pageable);
}
