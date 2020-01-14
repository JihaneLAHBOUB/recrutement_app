package com.everis.recrutement.repository.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * @author Souhaila
 */
@Entity
@Table(name="contrat")
public class Contrat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CONTRAT", nullable = false)
    private Integer idContrat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "TYPE_CONTRAT", nullable = false, length = 255)
    private String typeContrat;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contrat")
    private List<JobOffers> jobOffers;

    public Contrat() {
    }

	public Contrat(Integer idContrat) {
        this.idContrat = idContrat;
    }

    public Contrat(Integer idContrat, String typeContrat) {
        this.idContrat = idContrat;
        this.typeContrat = typeContrat;
    }

    public Integer getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(Integer idContrat) {
        this.idContrat = idContrat;
    }

    public String getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }
    public List<JobOffers> getJobOffers() {
		return jobOffers;
	}

	public void setJobOffers(List<JobOffers> jobOffers) {
		this.jobOffers = jobOffers;
	}
    
}
