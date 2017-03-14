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
		
		
		
		return null;
	}

}
