package com.torneo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="inscripcion")
public class Inscripcion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idinscripcion;
	
	@ManyToOne
	@JoinColumn(name="id_torneo", nullable = false)
	private Torneo torneo;
	
	@ManyToOne
	@JoinColumn(name="id_jugador", nullable = false)
	private JugadorLocal jugadorlocal;

	public Integer getIdinscripcion() {
		return idinscripcion;
	}

	public void setIdinscripcion(Integer idinscripcion) {
		this.idinscripcion = idinscripcion;
	}

	public Torneo getTorneo() {
		return torneo;
	}

	public void setTorneo(Torneo torneo) {
		this.torneo = torneo;
	}

	public JugadorLocal getJugadorlocal() {
		return jugadorlocal;
	}

	public void setJugadorlocal(JugadorLocal jugadorlocal) {
		this.jugadorlocal = jugadorlocal;
	}

}
