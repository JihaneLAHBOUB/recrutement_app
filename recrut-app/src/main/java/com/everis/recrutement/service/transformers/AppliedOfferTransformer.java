package com.everis.recrutement.service.transformers;

import com.everis.recrutement.repository.entity.AppliedOffer;
import com.everis.recrutement.service.dto.AppliedOfferDTO;

public class AppliedOfferTransformer extends AbstractTransformers<AppliedOfferDTO, AppliedOffer> {

	@Override
	public AppliedOfferDTO toDTO(AppliedOffer entity) {
		
		AppliedOfferDTO dto = new AppliedOfferDTO();
		
		dto.setId(entity.getId());
		dto.setState(entity.isState());
		dto.setIdCandidat(entity.getIdCandidat());
		dto.setIdOffer(entity.getIdOffer());
		return dto;
	}

	@Override
	public AppliedOffer toEntity(AppliedOfferDTO dto) {
		
		AppliedOffer entity = new AppliedOffer();
		
		entity.setId(dto.getId());
		entity.setState(dto.isState());
		entity.setIdCandidat(dto.getIdCandidat());
		entity.setIdOffer(dto.getIdOffer());
		return entity;
	}

}
