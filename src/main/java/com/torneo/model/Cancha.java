package com.torneo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cancha")
public class Cancha {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCancha;
	
	@ManyToOne
	@JoinColumn(name = "id_ciudad", nullable = false)
	private Ciudad ciudad;
	
	@Column(name="nomb_cancha",nullable = false)
	private String nombcancha;
	
	@Column(name="direccion_cancha")
	private String direc_cancha;

	public Integer getIdCancha() {
		return idCancha;
	}

	public void setIdCancha(Integer idCancha) {
		this.idCancha = idCancha;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public String getNombcancha() {
		return nombcancha;
	}

	public void setNombcancha(String nombcancha) {
		this.nombcancha = nombcancha;
	}

	public String getDirec_cancha() {
		return direc_cancha;
	}

	public void setDirec_cancha(String direc_cancha) {
		this.direc_cancha = direc_cancha;
	}
	
}
