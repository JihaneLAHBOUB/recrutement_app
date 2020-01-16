package com.everis.recrutement.service.dto;

import java.time.LocalDate;


public class OfferDTO {

	private Long id;
	private String offerName;
	private String description;
	private LocalDate publishingDay;
	private String position;

//	private List<AppliedOfferDTO> appliedOffersDTOList;

	public OfferDTO() {
		super();
	}

	public OfferDTO(Long id, String offerName, String description, LocalDate publishingDay, String position) {
		super();
		this.id = id;
		this.offerName = offerName;
		this.description = description;
		this.publishingDay = publishingDay;
		this.position = position;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getPublishingDay() {
		return publishingDay;
	}

	public void setPublishingDay(LocalDate publishingDay) {
		this.publishingDay = publishingDay;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

//	public List<AppliedOfferDTO> getAppliedOffersList() {
//		return appliedOffersDTOList;
//	}
//
//	public void setAppliedOffersList(List<AppliedOfferDTO> appliedOffers) {
//		this.appliedOffersDTOList = appliedOffers;
//	}

	@Override
	public String toString() {
		return "OfferDTO [id=" + id + ", offerName=" + offerName + ", description=" + description + ", publishingDay="
				+ publishingDay + ", position=" + position + "]";
	}

}
