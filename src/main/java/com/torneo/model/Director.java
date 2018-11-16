package com.torneo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "director")
public class Director {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDirector;
	
	@Column(name ="nomb_director",nullable =false, length = 70)
	private String nombreDirector;
	
	@Column(name ="email_director", nullable=false, length = 150)
	@Size(min = 10, max = 150, message = "Email debe tener 7 caracteres")
	private String emailDirector;
	
	@Column(name ="tel_director", nullable = false, length =7)
	@Size(min = 7, max = 7, message = "Telefono debe tener 7 caracteres")
	private String telDirector;

	public Integer getIdDirector() {
		return idDirector;
	}

	public void setIdDirector(Integer idDirector) {
		this.idDirector = idDirector;
	}

	public String getNombreDirector() {
		return nombreDirector;
	}

	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}

	public String getEmailDirector() {
		return emailDirector;
	}

	public void setEmailDirector(String emailDirector) {
		this.emailDirector = emailDirector;
	}

	public String getTelDirector() {
		return telDirector;
	}

	public void setTelDirector(String telDirector) {
		this.telDirector = telDirector;
	}
	
}
