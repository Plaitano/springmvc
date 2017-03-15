package com.trial.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Material {
	
	protected String name;
	
	@JsonProperty("ID")
	protected Integer id;
	
	private Integer companyID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@JsonProperty("id")
	public Integer getID() {
		return id;
	}
	
	@JsonProperty("id")
	public void setID(Integer iD) {
		id = iD;
	}
	public Integer getCompanyID() {
		return companyID;
	}
	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}
	

	
	

}
