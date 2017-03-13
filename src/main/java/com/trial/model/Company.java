package com.trial.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {
	
	private Integer companyId;
	private String companyName;

	public Integer getcompanyId() {
		return companyId;
	}
	public void setcompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getcompanyName() {
		return companyName;
	}
	public void setcompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
