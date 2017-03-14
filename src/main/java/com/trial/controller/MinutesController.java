package com.trial.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trial.model.Company;
import com.trial.service.RestService;

@Controller
public class MinutesController {
	
	@Autowired
	private RestService restService;
	
	
	 @RequestMapping(value="/*", method=RequestMethod.GET)
	 public String showHome(Model model){
		 
		 return "redirect:companies";
		 
	 }
	 
		
	 @RequestMapping(value="/companies", method=RequestMethod.GET)
	 public String showCompanies(Model model){
		 
		List<Company> companies = restService.getAllCompanies();
		
		  for(Company company : companies) {
	            System.out.println(company.getcompanyName());
	        }
		
		model.addAttribute("companies", companies);
		
		return "companies";
	 }
	 
	 @RequestMapping(value="/companies/materials/{id}", method=RequestMethod.GET)
	 public String showMaterials(Model model, @PathVariable int id){
		System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo" + id);
		
		return "companies";
	 }
	 
//	 @RequestMapping(value="/addMinutes", method = RequestMethod.POST)
//	 public String addMinutes(){
//		 
//		return "addMinutes";
//	 }

}
