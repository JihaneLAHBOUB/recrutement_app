package com.everis.recrutement.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.recrutement.repository.OfferDAO;
import com.everis.recrutement.repository.entity.Offer;
import com.everis.recrutement.service.OfferService;
import com.everis.recrutement.service.dto.OfferDTO;
import com.everis.recrutement.service.transformers.OfferTransformer;

@Service
public class OfferServiceImpl implements OfferService {

	@Autowired
	private OfferDAO offerDAO;
	
	public OfferTransformer transformer = new OfferTransformer();
	
	@Override
	public OfferDTO create(OfferDTO offerDTO) {
		
		Offer offerToCreate = transformer.toEntity(offerDTO);
		Offer offerCreated = offerDAO.save(offerToCreate);
		OfferDTO createdOfferDTO = transformer.toDTO(offerCreated);
		return createdOfferDTO;
	}

	@Override
	public OfferDTO update(OfferDTO offerDTO) {
		
		Offer offerToUpdate = transformer.toEntity(offerDTO);
		Offer offerUpdated = offerDAO.save(offerToUpdate);
		OfferDTO updatedOfferDTO = transformer.toDTO(offerUpdated);
		
		return updatedOfferDTO;
	}

	@Override
	public void delete(OfferDTO offerDTO) {

		Offer offerToDelete = transformer.toEntity(offerDTO);
		offerDAO.delete(offerToDelete);
		
	}

	@Override
	public OfferDTO getById(Long id) {
		
		Optional<Offer> offer = offerDAO.findById(id);

		if (offer.isPresent()) {

			return transformer.toDTO(offer.get());
		}

		return null;
	}

	@Override
	public List<OfferDTO> getAll() {
		
		List<Offer> listOffer = offerDAO.findAll();
		List<OfferDTO> listOfferDTO = new ArrayList<>();
		
		for (Offer offer : listOffer) {
			listOfferDTO.add(transformer.toDTO(offer));
		}
		return listOfferDTO;
	}


}
