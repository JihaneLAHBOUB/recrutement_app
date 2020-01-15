package com.everis.recrutement.repository.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class EducationGrade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String grade;
	@OneToMany()
	@JoinColumn(name ="Education_grade_id")
	private List<Candidat> candidats ;
	@OneToMany()
	@JoinColumn(name ="Education_grade_id")
	private List<Offer> offers ;
	
	
	public EducationGrade() {
		super();
	}
	
	public EducationGrade(Long id, String grade) {
		super();
		this.id = id;
		this.grade = grade;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
