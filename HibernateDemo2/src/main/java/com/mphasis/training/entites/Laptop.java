package com.mphasis.training.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	@Column(length=10)
	private String lpcode;
	@Column(length=10)
	private String brand;
	@Column(length=10)
	private String processor;
	private int ramsize;
	private int hddsize;
	public String getLpcode() {
		return lpcode;
	}
	public void setLpcode(String lpcode) {
		this.lpcode = lpcode;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRamsize() {
		return ramsize;
	}
	public void setRamsize(int ramsize) {
		this.ramsize = ramsize;
	}
	public int getHddsize() {
		return hddsize;
	}
	public void setHddsize(int hddsize) {
		this.hddsize = hddsize;
	}


}
