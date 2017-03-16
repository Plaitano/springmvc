package com.trial.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.trial.model.Company;
import com.trial.model.Material;
import com.trial.model.MaterialDetails;

@Service("restService")
public class RestServiceImpl implements RestService {
	
	private static final String HOST = "http://193.142.112.220:8337/";
	
	private RestTemplate restTemplate;
	
	public RestServiceImpl() {
		restTemplate = new RestTemplate();
	}

	public List<Company> getAllCompanies() {
		final String URI = HOST + "companyList";
		ResponseEntity<Company[]> responseEntity = restTemplate.getForEntity(URI , Company[].class);
		Company[] companies = responseEntity.getBody();
		
		return Arrays.asList(companies);
	}
	
	public List<Material> getMaterialsByCompanyId(Integer companyId){
		final String URI =  HOST + "materialList?companyID="+companyId;
		ResponseEntity<Material[]> responseEntity = restTemplate.getForEntity(URI , Material[].class);
		Material[] materials = responseEntity.getBody();
	
		return Arrays.asList(materials);
	}

	public MaterialDetails getMaterialDetails(Integer materialID) {
		final String URI =  HOST + "materialDetails?ID="+materialID;
		ResponseEntity<MaterialDetails> responseEntity = restTemplate.getForEntity(URI , MaterialDetails.class);
		MaterialDetails materialDetails = responseEntity.getBody();
		
		return materialDetails;
	}

}
