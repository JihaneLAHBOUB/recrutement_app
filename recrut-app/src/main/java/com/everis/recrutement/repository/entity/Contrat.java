package com.everis.recrutement.repository.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Contrat 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Contrat;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name ="Contrat_id")
	private List<Offer> offers ;
	public Contrat() {
		super();
	}
	public Contrat(Long id, String contrat) {
		super();
		this.id = id;
		Contrat = contrat;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContrat() {
		return Contrat;
	}
	public void setContrat(String contrat) {
		Contrat = contrat;
	}
	
	
	
	

}
