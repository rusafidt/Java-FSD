package com.Jpa.M2M.entity;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Courses_tab")
public class Courses {
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String Abbreviation;
	private int modules;
	private double fee;
	
	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
	
	@JsonBackReference
	private Set<Student>student;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAbbreviation() {
		return Abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		Abbreviation = abbreviation;
	}
	public int getModules() {
		return modules;
	}
	public void setModules(int modules) {
		this.modules = modules;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	

}
