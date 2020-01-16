package com.everis.recrutement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.everis.recrutement.repository.entity.AppliedOffer;

@Repository
public interface AppliedOfferDAO extends JpaRepository<AppliedOffer, Long> {

	@Query("select DISTINCT idCandidat from AppliedOffer where idOffer=:idOffer ")
	List<Long> findByIdOffer(@Param("idOffer") Long idOffer);
}
