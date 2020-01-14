package com.everis.recrutement.repository.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * @author Souhaila
 */
@Entity
@Table(name = "job_offers")
public class JobOffers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_JOB", nullable = false)
    private Integer idJob;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "JOB_TITLE", nullable = false, length = 255)
    private String jobTitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "JOB_DESCRIPTION", nullable = false, length = 255)
    private String jobDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "POSTING_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date postingDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IS_CLOSED", nullable = false)
    private boolean isClosed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NBR_POSITION", nullable = false)
    private int nbrPosition;
    
	@OneToOne
    @JoinColumn(name = "ID_COMPANY")
    private Company company=new Company() ;
   

	@JoinColumn(name = "ID_POSITION_FK", referencedColumnName = "ID_POSITION")
    @ManyToOne(optional = false)
     private Position position=new Position() ;
    
    @JoinColumn(name = "ID_EXPERIENCE_FK", referencedColumnName = "ID_EXPERIENCE")
    @ManyToOne(optional = false)
     private Experience experience=new Experience() ;
    
    @JoinColumn(name = "ID_CONTRAT_FK", referencedColumnName = "ID_CONTRAT")
    @ManyToOne(optional = false)
     private Contrat contrat=new Contrat() ;
    
    @JoinColumn(name = "FIELD_FK", referencedColumnName = "ID_Field")
    @ManyToOne(optional = false)
    private Field field=new Field() ;
    
    @OneToMany(mappedBy = "JobOffers")
    private List<AppliedJobs> AppliedJobsList;
   

	public JobOffers() {
    }

    public JobOffers(Integer idJob) {
        this.idJob = idJob;
    }

    public JobOffers(Integer idJob, String jobTitle, String jobDescription, Date postingDate, boolean isClosed, int nbrPosition) {
        this.idJob = idJob;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.postingDate = postingDate;
        this.isClosed = isClosed;
        this.nbrPosition = nbrPosition;
  
    }

    public Integer getIdJob() {
        return idJob;
    }

    public void setIdJob(Integer idJob) {
        this.idJob = idJob;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Date getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(Date postingDate) {
        this.postingDate = postingDate;
    }

    public boolean getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public int getNbrPosition() {
        return nbrPosition;
    }

    public void setNbrPosition(int nbrPosition) {
        this.nbrPosition = nbrPosition;
    }



    public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}
 
	  public Company getCompany() {
			return company;
		}

	public void setCompany(Company company) {
			this.company = company;
		}
	public List<AppliedJobs> getAppliedJobsList() {
			return AppliedJobsList;
		}

	public void setAppliedJobsList(List<AppliedJobs> appliedJobsList) {
			AppliedJobsList = appliedJobsList;
		}

}
