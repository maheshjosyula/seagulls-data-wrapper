package com.wf.diversity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wf.diversity.dto.Request;
import com.wf.diversity.model.CompanyDetails;
import com.wf.diversity.service.DiversityWrapperService;

@RestController
@RequestMapping("/diversity")
public class DiversityWrapperController {
	
	@Autowired
	DiversityWrapperService diversityWrapperService;

	@GetMapping("/companyDetails")
	public CompanyDetails getDetailsByCompanyName(@RequestParam("companyName") String companyName) {
		return diversityWrapperService.getDetailsByCompanyName(companyName);
	}
	
	@PostMapping("/updateDetails")
	public void updateCompanyDetails(@RequestBody Request request) {
		diversityWrapperService.updateCompanyDetails(request);
	}
}
