package com.everis.recrutement.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppliedOffer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private boolean state;
	private Long idCandidat;
	private Long idOffer;

	public AppliedOffer() {
		super();
	}

	public AppliedOffer(Long id, boolean state) {
		super();
		this.id = id;
		this.state = state;
	}

	
	public AppliedOffer(Long idCandidat, Long idOffer) {
		super();
		this.idCandidat = idCandidat;
		this.idOffer = idOffer;
	}

	public AppliedOffer(Long id, boolean state, Long idCandidat, Long idOffer) {
		super();
		this.id = id;
		this.state = state;
		this.idCandidat = idCandidat;
		this.idOffer = idOffer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Long getIdCandidat() {
		return idCandidat;
	}

	public void setIdCandidat(Long idCandidat) {
		this.idCandidat = idCandidat;
	}

	public Long getIdOffer() {
		return idOffer;
	}

	public void setIdOffer(Long idOffer) {
		this.idOffer = idOffer;
	}

	@Override
	public String toString() {
		return "AppliedOffer [id=" + id + ", state=" + state + ", idCandidat=" + idCandidat + ", idOffer=" + idOffer
				+ "]";
	}

}
