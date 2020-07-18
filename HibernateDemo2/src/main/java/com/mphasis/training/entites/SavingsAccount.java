package com.mphasis.training.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue(value = "SA")
@PrimaryKeyJoinColumn(name="accnum")
public class SavingsAccount extends Account{
	
	private long adharNum;

	public long getAdharNum() {
		return adharNum;
	}

	public void setAdharNum(long adharNum) {
		this.adharNum = adharNum;
	}
	

}
