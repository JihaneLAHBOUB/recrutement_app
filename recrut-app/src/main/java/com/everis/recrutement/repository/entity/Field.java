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
@Table(name="field")
public class Field implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_FIELD", nullable = false)
    private Integer idField;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "FIELD_NAME", nullable = false, length = 255)
    private String fieldName;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "field")
    private List<JobOffers> jobOffers;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "field")
    private List<Candidate> candidate;

	public Field() {
    }

    public Field(Integer idField) {
        this.idField = idField;
    }

	public Field(Integer idField, String fieldName) {
        this.idField = idField;
        this.fieldName = fieldName;
    }

    public Integer getIdField() {
        return idField;
    }

    public void setIdField(Integer idField) {
        this.idField = idField;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
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
