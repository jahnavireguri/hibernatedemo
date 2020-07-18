package com.mphasis.training.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Location {
	@Id
	private String lcode;
	@Column(length=10, unique=true)
	private String lname;
	public String getLcode() {
		return lcode;
	}
	@ManyToMany(mappedBy ="loc", fetch=FetchType.EAGER)
	private List<Department> deps= new ArrayList<>();
	
	public Location(String lcode, String lname) {
		super();
		this.lcode = lcode;
		this.lname = lname;
	}
	@Transient
	private int pincode;
	 
	public List<Department> getDeps() {
		return deps;
	}
	public void setDeps(List<Department> deps) {
		this.deps = deps;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
