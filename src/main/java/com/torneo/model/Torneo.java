package com.torneo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name="torneo")
public class Torneo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTorneo;
	
	@Column(name="nombre_torneo", nullable = false)
	private String nombreTorneo;
	
	@Column(name="descripcion_torneo",nullable =false)
	private String descripcionTorneo;
	
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime f_iniTorneo;
	
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime f_finTorneo;
	
	@Column(name="cantidad",nullable=false)
	private Integer cantidadJugadores;
	
	@ManyToOne
	@JoinColumn(name = "id_director", nullable = false)
	private Director director;

	public Integer getIdTorneo() {
		return idTorneo;
	}

	public void setIdTorneo(Integer idTorneo) {
		this.idTorneo = idTorneo;
	}

	public String getNombreTorneo() {
		return nombreTorneo;
	}

	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}

	public String getDescripcionTorneo() {
		return descripcionTorneo;
	}

	public void setDescripcionTorneo(String descripcionTorneo) {
		this.descripcionTorneo = descripcionTorneo;
	}

	public LocalDateTime getF_iniTorneo() {
		return f_iniTorneo;
	}

	public void setF_iniTorneo(LocalDateTime f_iniTorneo) {
		this.f_iniTorneo = f_iniTorneo;
	}

	public LocalDateTime getF_finTorneo() {
		return f_finTorneo;
	}

	public void setF_finTorneo(LocalDateTime f_finTorneo) {
		this.f_finTorneo = f_finTorneo;
	}

	public Integer getCantidadJugadores() {
		return cantidadJugadores;
	}

	public void setCantidadJugadores(Integer cantidadJugadores) {
		this.cantidadJugadores = cantidadJugadores;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
}
