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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name="partido")
public class Partido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpartido;
	
	@ManyToOne
	@JoinColumn(name = "id_jugadorLocal", nullable = false)
	private JugadorLocal jugadorLocal;
	
	@ManyToOne
	@JoinColumn(name = "id_jugadorVisitante", nullable = false)
	private JugadorVisitante jugadorvisitante;
	
	@ManyToOne
	@JoinColumn(name = "id_ronda", nullable = false)
	private Ronda ronda;
	
	@ManyToOne
	@JoinColumn(name = "id_cancha", nullable = false)
	private Cancha cancha;
	
	@ManyToOne
	@JoinColumn(name = "id_arbitro", nullable = false)
	private Arbitro arbitro;
	
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime fechainipartido;
	
	@Column(name="hora",nullable=false, length = 4)
	@Size(min = 4, max = 4, message = "Hora debe tener 4 caracteres")
	private String hora;

	public JugadorVisitante getJugadorvisitante() {
		return jugadorvisitante;
	}

	public void setJugadorvisitante(JugadorVisitante jugadorvisitante) {
		this.jugadorvisitante = jugadorvisitante;
	}

	public Integer getIdpartido() {
		return idpartido;
	}

	public void setIdpartido(Integer idpartido) {
		this.idpartido = idpartido;
	}

	public JugadorLocal getJugadorLocal() {
		return jugadorLocal;
	}

	public void setJugadorLocal(JugadorLocal jugadorLocal) {
		this.jugadorLocal = jugadorLocal;
	}

	public Ronda getRonda() {
		return ronda;
	}

	public void setRonda(Ronda ronda) {
		this.ronda = ronda;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public Arbitro getArbitro() {
		return arbitro;
	}

	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}

	public LocalDateTime getFechainipartido() {
		return fechainipartido;
	}

	public void setFechainipartido(LocalDateTime fechainipartido) {
		this.fechainipartido = fechainipartido;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
}
