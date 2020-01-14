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
@Table(name = "experience")
public class Experience implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_EXPERIENCE", nullable = false)
    private Integer idExperience;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EXPERIENCE_LEVEL", nullable = false, length = 50)
    private String experienceLevel;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "experience")
    private List<JobOffers> jobOffers;

   
	public Experience() {
    }

    public Experience(Integer idExperience) {
        this.idExperience = idExperience;
    }

    public Experience(Integer idExperience, String experienceLevel) {
        this.idExperience = idExperience;
        this.experienceLevel = experienceLevel;
    }

    public Integer getIdExperience() {
        return idExperience;
    }

    public void setIdExperience(Integer idExperience) {
        this.idExperience = idExperience;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }
    public List<JobOffers> getJobOffers() {
		return jobOffers;
	}

	public void setJobOffers(List<JobOffers> jobOffers) {
		this.jobOffers = jobOffers;
	}

}
