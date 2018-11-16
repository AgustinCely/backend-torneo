package com.torneo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="puntos")
public class Puntos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPuntos;
	
	@Column(name="punto", nullable=false)
	private Integer punto;

	public Integer getIdPuntos() {
		return idPuntos;
	}

	public void setIdPuntos(Integer idPuntos) {
		this.idPuntos = idPuntos;
	}

	public Integer getPunto() {
		return punto;
	}

	public void setPunto(Integer punto) {
		this.punto = punto;
	}
	
}
