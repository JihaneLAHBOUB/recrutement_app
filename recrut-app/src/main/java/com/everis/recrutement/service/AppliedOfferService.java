package com.everis.recrutement.service;

import java.util.List;

import com.everis.recrutement.service.dto.AppliedOfferDTO;

public interface AppliedOfferService {

	AppliedOfferDTO create(AppliedOfferDTO appliedOfferDTO);
	
	List<Long> getAppliedCandidat(Long idOffer);
}
