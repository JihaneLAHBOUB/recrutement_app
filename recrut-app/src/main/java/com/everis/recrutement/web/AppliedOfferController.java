package com.everis.recrutement.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.recrutement.service.AppliedOfferService;
import com.everis.recrutement.service.dto.AppliedOfferDTO;

@RestController
public class AppliedOfferController {

	@Autowired
	private AppliedOfferService appliedOfferService;
	
	@PostMapping("/addAppliedOffer")
	private AppliedOfferDTO createOffer(@RequestBody AppliedOfferDTO appliedOfferDTO) {

		AppliedOfferDTO appliedOffer = new AppliedOfferDTO(appliedOfferDTO.getIdCandidat(),appliedOfferDTO.getIdOffer());
		
		AppliedOfferDTO dto = appliedOfferService.create(appliedOffer);
		return dto;
	}
	
	@GetMapping("/getAppliedCandidat/{id}")
	private List<Long> getAppliedCandidat(@PathVariable("id") Long idOffer){
		
		return appliedOfferService.getAppliedCandidat(idOffer);
	}
}
