package com.efrei;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rent {
	
	private long key;
	private Date begin;
	private Date end;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getKey() {
		return key;
	}

	public void setKey(long key) {
		this.key = key;
	}

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

}
