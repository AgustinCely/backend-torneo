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
@Table(name = "jugadorlocal")
public class JugadorLocal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idJugadorlocal;
	
	@Column(name = "nombjugadorlocal", nullable = false, length = 70)
	private String nombjugadorlocal;
	
	@Column(name = "apejugadorlocal", nullable = false, length = 70)
	private String apejugadorlocal;
	
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime fecha_nac;
	
	@Column(name="altura_jugadorlocal",nullable = true)
	private Double alturajugadorlocal; 
	
	@Column(name="peso_jugador",nullable = true)
	private Double pesojugadorlocal;
	
	@Column(name="rank_jugador",nullable = true)
	private Integer rankjugadorlocal;

	public Integer getIdJugadorlocal() {
		return idJugadorlocal;
	}

	public void setIdJugadorlocal(Integer idJugadorlocal) {
		this.idJugadorlocal = idJugadorlocal;
	}

	public String getNombjugadorlocal() {
		return nombjugadorlocal;
	}

	public void setNombjugadorlocal(String nombjugadorlocal) {
		this.nombjugadorlocal = nombjugadorlocal;
	}

	public String getApejugadorlocal() {
		return apejugadorlocal;
	}

	public void setApejugadorlocal(String apejugadorlocal) {
		this.apejugadorlocal = apejugadorlocal;
	}

	public LocalDateTime getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDateTime fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public Double getAlturajugadorlocal() {
		return alturajugadorlocal;
	}

	public void setAlturajugadorlocal(Double alturajugadorlocal) {
		this.alturajugadorlocal = alturajugadorlocal;
	}

	public Double getPesojugadorlocal() {
		return pesojugadorlocal;
	}

	public void setPesojugadorlocal(Double pesojugadorlocal) {
		this.pesojugadorlocal = pesojugadorlocal;
	}

	public Integer getRankjugadorlocal() {
		return rankjugadorlocal;
	}

	public void setRankjugadorlocal(Integer rankjugadorlocal) {
		this.rankjugadorlocal = rankjugadorlocal;
	}

	
}
