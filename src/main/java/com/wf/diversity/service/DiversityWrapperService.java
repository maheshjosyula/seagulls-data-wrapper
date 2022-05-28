package com.wf.diversity.service;

import com.wf.diversity.dto.Request;
import com.wf.diversity.model.CompanyDetails;

public interface DiversityWrapperService {
	public CompanyDetails getDetailsByCompanyName(String companyName);
	public void updateCompanyDetails(Request request);
}
