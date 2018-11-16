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
@Table(name="ronda")
public class Ronda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idronda;
	
	@Column(name="descripcion_ronda",nullable =false)
	private String descripcionRonda;
	
	@ManyToOne
	@JoinColumn(name = "id_premio", nullable = false)
	private Premio premio;
	
	@ManyToOne
	@JoinColumn(name = "id_puntos", nullable = false)
	private Puntos puntos;

	public Integer getIdronda() {
		return idronda;
	}

	public void setIdronda(Integer idronda) {
		this.idronda = idronda;
	}

	public String getDescripcionRonda() {
		return descripcionRonda;
	}

	public void setDescripcionRonda(String descripcionRonda) {
		this.descripcionRonda = descripcionRonda;
	}

	public Premio getPremio() {
		return premio;
	}

	public void setPremio(Premio premio) {
		this.premio = premio;
	}

	public Puntos getPuntos() {
		return puntos;
	}

	public void setPuntos(Puntos puntos) {
		this.puntos = puntos;
	}
	
}
