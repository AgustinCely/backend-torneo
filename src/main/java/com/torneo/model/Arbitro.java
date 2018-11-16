package com.torneo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "arbitro")
public class Arbitro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idArbitro;
	
	@Column(name="nomb_arbitro",nullable = false)
	private String nombArbitro;
	
	@Column(name="ape_arbitro", nullable = false)
	private String apeArbitro;
	
	@Column(name="tel_arbitro", nullable = false)
	@Size(min = 7, max = 7, message = "Telefono debe tener 7 caracteres")
	private String telArbitro;
	
	@Column(name="email_arbitro", nullable = false)
	@Size(min = 10, max = 150, message ="Email debe tener 150 caracteres")
	private String emailArbitro;

	public Integer getIdArbitro() {
		return idArbitro;
	}

	public void setIdArbitro(Integer idArbitro) {
		this.idArbitro = idArbitro;
	}

	public String getNombArbitro() {
		return nombArbitro;
	}

	public void setNombArbitro(String nombArbitro) {
		this.nombArbitro = nombArbitro;
	}

	public String getApeArbitro() {
		return apeArbitro;
	}

	public void setApeArbitro(String apeArbitro) {
		this.apeArbitro = apeArbitro;
	}

	public String getTelArbitro() {
		return telArbitro;
	}

	public void setTelArbitro(String telArbitro) {
		this.telArbitro = telArbitro;
	}

	public String getEmailArbitro() {
		return emailArbitro;
	}

	public void setEmailArbitro(String emailArbitro) {
		this.emailArbitro = emailArbitro;
	}
	
}
