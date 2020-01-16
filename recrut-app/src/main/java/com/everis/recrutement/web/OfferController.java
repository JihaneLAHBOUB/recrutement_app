package com.everis.recrutement.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.recrutement.service.OfferService;
import com.everis.recrutement.service.dto.OfferDTO;

@RestController
public class OfferController {

	@Autowired
	private OfferService offerService;

	@GetMapping("/Offers")
	public List<OfferDTO> home() {

		List<OfferDTO> listOfferDTO = offerService.getAll();
		return listOfferDTO;
	}

	@PostMapping("/addOffer")
	private OfferDTO createOffer(@RequestBody OfferDTO offerDTO) {

		OfferDTO dto = offerService.create(offerDTO);
		return dto;
	}

	@DeleteMapping("/deleteOffer/{id}")
	private List<OfferDTO> deleteOffer(@PathVariable("id") Long id) {

		OfferDTO offerDto = offerService.getById(id);
		offerService.delete(offerDto);

		List<OfferDTO> listOfferDTO = offerService.getAll();

		return listOfferDTO;
	}

	@PutMapping("/updateOffer/{id}")
	private List<OfferDTO> updateOffers(@PathVariable("id") Long id, @RequestBody OfferDTO offerDTO) {
		offerDTO.setId(id);
		offerService.update(offerDTO);
		List<OfferDTO> listOfferDTO = offerService.getAll();

		return listOfferDTO;

	}

}
