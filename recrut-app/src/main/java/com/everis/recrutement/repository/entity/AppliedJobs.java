package com.everis.recrutement.repository.entity;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author souhaila
 */
@Entity
@Table(name = "applied_jobs")
public class AppliedJobs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_APPLIEDJOBS", nullable = false)
    private Integer idAppliedjobs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "APPLYING_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date applyingDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IS_ACCEPTED", nullable = false)
    private boolean isAccepted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_JOB_FK", nullable = false)
    private int idJobFk;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CANDIDATE_FK", nullable = false)
    private int idCandidateFk;
    
    
    @JoinColumn(name = "ID_JOB_FK", referencedColumnName = "ID_JOB")
    @OneToOne
    private JobOffers jobOffers=new JobOffers();
    
    
    @JoinColumn(name = "ID_CANDIDATE_FK", referencedColumnName = "ID_CANDIDATE")
    @OneToOne
    private Candidate candidate=new Candidate();
   
    
	public AppliedJobs() {
    }

    public AppliedJobs(Integer idAppliedjobs) {
        this.idAppliedjobs = idAppliedjobs;
    }

    public AppliedJobs(Integer idAppliedjobs, Date applyingDate, boolean isAccepted) {
        this.idAppliedjobs = idAppliedjobs;
        this.applyingDate = applyingDate;
        this.isAccepted = isAccepted;
      
    }

    public Integer getIdAppliedjobs() {
        return idAppliedjobs;
    }

    public void setIdAppliedjobs(Integer idAppliedjobs) {
        this.idAppliedjobs = idAppliedjobs;
    }

    public Date getApplyingDate() {
        return applyingDate;
    }

    public void setApplyingDate(Date applyingDate) {
        this.applyingDate = applyingDate;
    }

    public boolean getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public int getIdJobFk() {
        return idJobFk;
    }

    public void setIdJobFk(int idJobFk) {
        this.idJobFk = idJobFk;
    }

    public int getIdCandidateFk() {
        return idCandidateFk;
    }

    public void setIdCandidateFk(int idCandidateFk) {
        this.idCandidateFk = idCandidateFk;
    }
    public JobOffers getJobOffers() {
  		return jobOffers;
  	}

  	public void setJobOffers(JobOffers jobOffers) {
  		this.jobOffers = jobOffers;
  	}

  	public Candidate getCandidate() {
  		return candidate;
  	}

  	public void setCandidate(Candidate candidate) {
  		this.candidate = candidate;
  	}

   
}
