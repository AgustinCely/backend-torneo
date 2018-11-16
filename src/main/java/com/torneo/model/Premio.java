package com.torneo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="premio")
public class Premio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdPremio;
	
	@Column(name="rewards",nullable =false)
	private Integer rewards;

	public Integer getIdPremio() {
		return IdPremio;
	}

	public void setIdPremio(Integer idPremio) {
		IdPremio = idPremio;
	}

	public Integer getRewards() {
		return rewards;
	}

	public void setRewards(Integer rewards) {
		this.rewards = rewards;
	}
	
}
