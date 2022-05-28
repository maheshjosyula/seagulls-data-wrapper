package com.wf.diversity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wf.diversity.dao.DiversityWrapperDao;
import com.wf.diversity.dto.Request;
import com.wf.diversity.model.CompanyDetails;
import com.wf.diversity.service.DiversityWrapperService;

@Service
public class DiversityWrapperServiceImpl implements DiversityWrapperService {

	@Autowired
	DiversityWrapperDao diversityWrapperDao;

	@Override
	public CompanyDetails getDetailsByCompanyName(String companyName) {
		return diversityWrapperDao.findByDunsName(companyName);
	}

	@Override
	@Transactional
	public void updateCompanyDetails(Request request) {
		diversityWrapperDao.updateCompanyDetails(request.getIsWomanOwned(),request.getMinorityOwnedDesc(),request.getDunsName());
	}
}
