package com.torneo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "jugadorvisitante")
public class JugadorVisitante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idJugadorvisitante;
	
	@Column(name = "nombjugadorvisitante", nullable = false, length = 70)
	private String nombjugadorvisitante;
	
	@Column(name = "apejugadorvisitante", nullable = false, length = 70)
	private String apejugadorvisitante;
	
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime fecha_nac;
	
	@Column(name="altura_jugadorvisitante",nullable = true)
	private Double alturajugadorvisitante; 
	
	@Column(name="peso_jugador",nullable = true)
	private Double pesojugadorvisitante;
	
	@Column(name="rank_jugador",nullable = true)
	private Integer rankjugadorvisitante;

	public Integer getIdJugadorvisitante() {
		return idJugadorvisitante;
	}

	public void setIdJugadorvisitante(Integer idJugadorvisitante) {
		this.idJugadorvisitante = idJugadorvisitante;
	}

	public String getNombjugadorvisitante() {
		return nombjugadorvisitante;
	}

	public void setNombjugadorvisitante(String nombjugadorvisitante) {
		this.nombjugadorvisitante = nombjugadorvisitante;
	}

	public String getApejugadorvisitante() {
		return apejugadorvisitante;
	}

	public void setApejugadorvisitante(String apejugadorvisitante) {
		this.apejugadorvisitante = apejugadorvisitante;
	}

	public LocalDateTime getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDateTime fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public Double getAlturajugadorvisitante() {
		return alturajugadorvisitante;
	}

	public void setAlturajugadorvisitante(Double alturajugadorvisitante) {
		this.alturajugadorvisitante = alturajugadorvisitante;
	}

	public Double getPesojugadorvisitante() {
		return pesojugadorvisitante;
	}

	public void setPesojugadorvisitante(Double pesojugadorvisitante) {
		this.pesojugadorvisitante = pesojugadorvisitante;
	}

	public Integer getRankjugadorvisitante() {
		return rankjugadorvisitante;
	}

	public void setRankjugadorvisitante(Integer rankjugadorvisitante) {
		this.rankjugadorvisitante = rankjugadorvisitante;
	}

}
