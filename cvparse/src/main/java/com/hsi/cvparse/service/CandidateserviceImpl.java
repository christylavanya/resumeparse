package com.hsi.cvparse.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hsi.cvparse.dao.ICandidateDAO;
import com.hsi.cvparse.dto.CandidateInfoDto;
import com.hsi.cvparse.service.helper.UploadCandidateHelper;


@Service
public class CandidateserviceImpl implements ICandidateservice
{
	
	@Autowired
	UploadCandidateHelper uploadCandidateHelper;
	
	@Autowired
	ICandidateDAO iCandidateDAO;
	
	
	
	private static final Logger LOG = LoggerFactory.getLogger(CandidateserviceImpl.class);

	@Override
	public List<CandidateInfoDto> getCandidateDetails() {
		
		LOG.info("Getting Candidate info details");
		List<CandidateInfoDto> candidateinfoList=new ArrayList<CandidateInfoDto>();
		return iCandidateDAO.getCandidateDetails();
	
	}
	
	@Override
	public List<CandidateInfoDto> uploadCVFile() throws IOException
	{
		String file="./public/csvfile.csv"; 
		List<CandidateInfoDto> candidateList=new ArrayList<>();
		try {
			candidateList = uploadCandidateHelper.convertCSVtoPOJO(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return candidateList; 
		 
	}
	
}
