package com.everis.recrutement.service.transformers;

import com.everis.recrutement.repository.entity.Offer;
import com.everis.recrutement.service.dto.OfferDTO;

public class OfferTransformer extends AbstractTransformers<OfferDTO, Offer> {

//	private AppliedOfferTransformer transformer = new AppliedOfferTransformer() ;
	
	@Override
	public OfferDTO toDTO(Offer entity) {
		
		OfferDTO dto = new OfferDTO();
		dto.setId(entity.getId());
		dto.setOfferName(entity.getOfferName());
		dto.setDescription(entity.getDescription());
		dto.setPosition(entity.getPosition());
		dto.setPublishingDay(entity.getPublishingDay());
		
//		if(entity.getAppliedOffersList() != null) {
//			dto.setAppliedOffersList(transformer.toDTOList(entity.getAppliedOffersList()));
//		}
		return dto;
	}

	@Override
	public Offer toEntity(OfferDTO dto) {
		
		Offer entity = new Offer();
		entity.setId(dto.getId());
		entity.setOfferName(dto.getOfferName());
		entity.setDescription(dto.getDescription());
		entity.setPosition(dto.getPosition());
		entity.setPublishingDay(dto.getPublishingDay());
		
//		if(dto.getAppliedOffersList() != null) {
//			entity.setAppliedOffersList(transformer.toEntityList(dto.getAppliedOffersList()));
//		}
		
		
		return entity;
	}

}
