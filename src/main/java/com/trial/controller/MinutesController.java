package com.trial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trial.model.Company;
import com.trial.model.Material;
import com.trial.model.MaterialDetails;
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
	
		model.addAttribute("companies", companies);
		
		return "companies";
	 }
	 
	 @RequestMapping(value="/companies/materials/{id}", method=RequestMethod.GET)
	 public ModelAndView showMaterials(Model model, @PathVariable int id){

			List<Material> materials = restService.getMaterialsByCompanyId(id);
			
			model.addAttribute("materials", materials);
			return new ModelAndView("materials");
		 
	 }
	 
	 
	 @RequestMapping(value="/material/{id}", method=RequestMethod.GET)
	 public ModelAndView showMaterialDetails(Model model, @PathVariable int id){

			MaterialDetails matDetails = restService.getMaterialDetails(id);
			
			model.addAttribute("matDetails", matDetails);
			
			return new ModelAndView("materialDetails");
		 
	 }

}
