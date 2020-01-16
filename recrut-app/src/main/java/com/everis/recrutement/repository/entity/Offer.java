package com.everis.recrutement.repository.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Offer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String offerName;
	private String description;
	private LocalDate publishingDay;
	private String position;

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "offer_id")
//	private List<AppliedOffer> appliedOffersList;

	public Offer() {
		super();
	}

	public Offer(Long id, String offerName, String description, LocalDate publishingDay, String position) {
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

//	public List<AppliedOffer> getAppliedOffersList() {
//		return appliedOffersList;
//	}
//
//	public void setAppliedOffersList(List<AppliedOffer> appliedOffers) {
//		this.appliedOffersList = appliedOffers;
//	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", offerName=" + offerName + ", description=" + description + ", publishingDay="
				+ publishingDay + ", position=" + position +  "]";
	}

}
