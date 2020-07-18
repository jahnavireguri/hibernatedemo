package com.mphasis.training.entites;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length=10)
	private String ename;
	
	@OneToOne(mappedBy="employee", cascade=CascadeType.ALL)
	
//  @OneToOne(cascade = CascadeType.ALL)
//  @JoinTable(name="emp_add", joinColumns = {
//          @JoinColumn(name="emp_id", referencedColumnName = "id")
//  },
//  inverseJoinColumns = {
//          @JoinColumn(name="addre_id",referencedColumnName = "id" )
//  })
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

}
