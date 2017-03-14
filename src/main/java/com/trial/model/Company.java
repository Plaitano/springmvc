package com.trial.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {
	
	private Integer companyID;
	private String companyName;

	public Integer getcompanyID() {
		return companyID;
	}
	public void setcompanyId(Integer companyID) {
		this.companyID = companyID;
	}
	public String getcompanyName() {
		return companyName;
	}
	public void setcompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
