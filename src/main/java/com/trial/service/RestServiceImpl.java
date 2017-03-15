package com.trial.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.trial.model.Company;
import com.trial.model.Material;
import com.trial.model.MaterialDetails;

@Service("restService")
public class RestServiceImpl implements RestService {

	public List<Company> getAllCompanies() {
		
		final String URI = "http://193.142.112.220:8337/companyList";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Company[]> responseEntity = restTemplate.getForEntity(URI , Company[].class);
		Company[] companies = responseEntity.getBody();
		MediaType contentType = responseEntity.getHeaders().getContentType();
		HttpStatus statusCode = responseEntity.getStatusCode();		
		
		//System.out.println(companies[0].getcompanyName());
		
		return Arrays.asList(companies);
	}
	
	public List<Material> getMaterialsByCompanyId(Integer companyId){
		
		final String URI = "http://193.142.112.220:8337/materialList?companyID="+companyId;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Material[]> responseEntity = restTemplate.getForEntity(URI , Material[].class);
		Material[] materials = responseEntity.getBody();
	
		return Arrays.asList(materials);
	}

	public MaterialDetails getMaterialDetails(Integer materialID) {
		
		final String URI = "http://193.142.112.220:8337/materialDetails?ID="+materialID;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<MaterialDetails> responseEntity = restTemplate.getForEntity(URI , MaterialDetails.class);
		MaterialDetails materialDetails = responseEntity.getBody();
		
		return materialDetails;
	}

}
