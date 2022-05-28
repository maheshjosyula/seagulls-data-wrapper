package com.wf.diversity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.wf.diversity.model.CompanyDetails;

public interface DiversityWrapperDao extends JpaRepository<CompanyDetails, Long>{
	CompanyDetails findByDunsName(String name);
	
	@Modifying
	@Query("update MinorityOwned mo set mo.isWomanOwned = ?1, mo.minorityOwnedDesc = ?2 where mo.dunsName = ?3")
	void updateCompanyDetails(String isWomanOwned, String minorityOwnedDesc, String dunsName);
}
