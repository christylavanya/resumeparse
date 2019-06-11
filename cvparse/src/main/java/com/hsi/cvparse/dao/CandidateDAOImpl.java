package com.hsi.cvparse.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hsi.cvparse.dto.CandidateInfoDto;


@Repository
@JsonSerialize
public class CandidateDAOImpl implements ICandidateDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(CandidateDAOImpl.class);
	
	@Autowired
	private EntityManager entityManager;

	@Autowired
	DataSource dataSource;

	@Override
	public List<CandidateInfoDto> getCandidateDetails() {
		logger.info("Collecting Candidate Details ::::::");
		List<CandidateInfoDto> listCandidateDetails=new ArrayList<>();
		CandidateInfoDto dto=new CandidateInfoDto();
		dto.setName("Christy");
		dto.setEmail("christy@gmail.com");
		dto.setMobile("123456789");
		dto.setQualification("B.E");
		dto.setPrimarySkill("Java");
		dto.setSecondarySkill("Python");
		dto.setExperience("4 yrs");
		dto.setResumePostedDate("08-06-2019");
		
		listCandidateDetails.add(dto);
		
		return listCandidateDetails;
	}

}
