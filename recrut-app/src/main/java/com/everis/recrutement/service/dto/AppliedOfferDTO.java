package com.everis.recrutement.service.dto;

public class AppliedOfferDTO {

	private Long id;
	private boolean state;

	public AppliedOfferDTO() {
		super();
	}

	public AppliedOfferDTO(Long id, boolean state) {
		super();
		this.id = id;
		this.state = state;
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

	@Override
	public String toString() {
		return "AppliedOfferDTO [id=" + id + ", state=" + state + "]";
	}

}
