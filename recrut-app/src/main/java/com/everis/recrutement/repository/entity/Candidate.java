package com.everis.recrutement.repository.entity;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * @author Souhaila
 */
@Entity
@Table(name = "candidate")
public class Candidate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CANDIDATE", nullable = false)
    private Integer idCandidate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false, length = 255)
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false, length = 255)
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(nullable = false, length = 255)
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PHONE_NUMBER", nullable = false, length = 255)
    private String phoneNumber;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private byte[] resume;
    
    @OneToOne
    @JoinColumn(name = "ID_USER")
	private User user=new User();
    
    @JoinColumn(name = "EXPERIENCE_FK", referencedColumnName = "ID_EXPERIENCE")
    @ManyToOne(optional = false)
     private Experience experience=new Experience() ;
  
    @JoinColumn(name = "POSITION_FK", referencedColumnName = "ID_POSITION")
    @ManyToOne(optional = false)
     private Position position=new Position() ;
   
    @JoinColumn(name = "ID_FIELD_FK", referencedColumnName = "ID_Field")
    @ManyToOne(optional = false)
    private Field field=new Field() ;

    public Candidate() {
    }

    public Candidate(Integer idCandidate) {
        this.idCandidate = idCandidate;
    }

    public Candidate(Integer idCandidate, String email, String firstname, String lastname, String phoneNumber, byte[] resume) {
        this.idCandidate = idCandidate;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.resume = resume;
  
    }

    public Integer getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(Integer idCandidate) {
        this.idCandidate = idCandidate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public byte[] getResume() {
        return resume;
    }

    public void setResume(byte[] resume) {
        this.resume = resume;
    }

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

 

   
    
}
