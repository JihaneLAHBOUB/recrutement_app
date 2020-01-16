package com.everis.recrutement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.recrutement.repository.entity.AppliedOffer;

@Repository
public interface AppliedOfferDAO extends JpaRepository<AppliedOffer, Long> {

}
