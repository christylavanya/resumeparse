package com.hsi.cvparse.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hsi.cvparse.dto.CandidateInfoDto;



@Repository
public interface ICandidateDAO {
	
	List<CandidateInfoDto> getCandidateDetails();

}
