package com.trial.service;

import java.util.List;

import com.trial.model.Company;
import com.trial.model.Material;
import com.trial.model.MaterialDetails;

public interface RestService {
	
	public List<Company> getAllCompanies();
	public List<Material> getMaterialsByCompanyId(Integer companyId);
	public MaterialDetails getMaterialDetails(Integer materialID);

}
