package com.efrei;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Rent {
	
	private Date beginRent;
	private Date endRent;
	private long key;
	
	@Id
	public long getKey() {
		return key;
	}
	
	public void setKey(long key) {
		this.key = key;
	}

	@Temporal(TemporalType.DATE)
	public Date getBeginRent() {
		return beginRent;
	}

	public void setBeginRent(Date beginRent) {
		this.beginRent = beginRent;
	}

	@Temporal(TemporalType.DATE)
	public Date getEndRent() {
		return endRent;
	}

	public void setEndRent(Date endRent) {
		this.endRent = endRent;
	}
	
	

}
