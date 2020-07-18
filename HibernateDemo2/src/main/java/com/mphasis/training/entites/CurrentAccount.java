package com.mphasis.training.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "accnum")
public class CurrentAccount extends Account{
	@Column(length = 10)
	private long gstin;

	public long getGstin() {
		return gstin;
	}

	public void setGstin(long gstin) {
		this.gstin = gstin;
	}
	

}
