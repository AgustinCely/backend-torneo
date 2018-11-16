package com.torneo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ciudad")
public class Ciudad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCiudad;
	
	@Column(name="nomb_ciudad", nullable=false)
	private String nombCiudad;

	public Integer getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombCiudad() {
		return nombCiudad;
	}

	public void setNombCiudad(String nombCiudad) {
		this.nombCiudad = nombCiudad;
	}
	
}
