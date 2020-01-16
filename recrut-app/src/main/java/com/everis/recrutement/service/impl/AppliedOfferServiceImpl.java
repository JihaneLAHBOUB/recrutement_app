package com.everis.recrutement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.recrutement.repository.AppliedOfferDAO;
import com.everis.recrutement.repository.entity.AppliedOffer;
import com.everis.recrutement.service.AppliedOfferService;
import com.everis.recrutement.service.dto.AppliedOfferDTO;
import com.everis.recrutement.service.transformers.AppliedOfferTransformer;

@Service
public class AppliedOfferServiceImpl implements AppliedOfferService {

	@Autowired
	private AppliedOfferDAO appliedOfferDAO;

	public AppliedOfferTransformer transformer = new AppliedOfferTransformer();

	@Override
	public AppliedOfferDTO create(AppliedOfferDTO appliedOfferDTO) {

		AppliedOffer appliedOfferToCreate = transformer.toEntity(appliedOfferDTO);
		AppliedOffer appliedOfferCreated = appliedOfferDAO.save(appliedOfferToCreate);
		AppliedOfferDTO createdOfferDTO = transformer.toDTO(appliedOfferCreated);

		return createdOfferDTO;
	}

	@Override
	public List<Long> getAppliedCandidat(Long idOffer) {

		List<Long> list = appliedOfferDAO.findByIdOffer(idOffer);

		return list;
	}

}
