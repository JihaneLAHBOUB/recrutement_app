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
@Table(name="position")
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_POSITION", nullable = false)
    private Integer idPosition;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "POSITION_NAME", nullable = false, length = 255)
    private String positionName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "STUDY_LEVEL", nullable = false, length = 255)
    private String studyLevel;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "position")
    private List<JobOffers> jobOffers;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "position")
    private List<Candidate> candidate;

    public Position() {
    }

    public Position(Integer idPosition) {
        this.idPosition = idPosition;
    }

    public Position(Integer idPosition, String positionName, String studyLevel) {
        this.idPosition = idPosition;
        this.positionName = positionName;
        this.studyLevel = studyLevel;
    }

    public Integer getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Integer idPosition) {
        this.idPosition = idPosition;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getStudyLevel() {
        return studyLevel;
    }

    public void setStudyLevel(String studyLevel) {
        this.studyLevel = studyLevel;
    }
    public List<JobOffers> getJobOffers() {
  		return jobOffers;
  	}

  	public void setJobOffers(List<JobOffers> jobOffers) {
  		this.jobOffers = jobOffers;
  	}
    public List<Candidate> getCandidate() {
		return candidate;
	}

	public void setCandidate(List<Candidate> candidate) {
		this.candidate = candidate;
	}
}
