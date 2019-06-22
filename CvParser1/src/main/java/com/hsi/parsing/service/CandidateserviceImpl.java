package com.hsi.parsing.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsi.parsing.model.CandidateInfo;
import com.hsi.parsing.service.helper.UploadCandidateHelper;

/**
 * Service Implementation to read multiple csv files for parse and display in html
 * This method will call from UI to display all candidate details from temp folder to read multiple csv files 
 * and display html table
 * --
 **/
@Service
public class CandidateserviceImpl implements ICandidateservice
{
	@Autowired
	UploadCandidateHelper uploadCandidateHelper;
	
		
	//private static final Logger LOG = LoggerFactory.getLogger(CandidateserviceImpl.class);

	/*
	 * @Override public List<CandidateInfoDto> getCandidateDetails() {
	 * 
	 * LOG.info("Getting Candidate info details"); List<CandidateInfoDto>
	 * candidateinfoList=new ArrayList<CandidateInfoDto>(); return
	 * iCandidateDAO.getCandidateDetails();
	 * 
	 * }
	 */
	
	@Override
	public List<CandidateInfo> uploadCVFile() throws IOException
	{
		String file="D:/christy/personal/resume/sample_resume/Temp"; 
		List<CandidateInfo> candidateList=new ArrayList<>();
		try {
			candidateList = uploadCandidateHelper.convertCSVtoPOJO(file);
			//System.out.println("all candidate"+candidateList.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return candidateList; 
		 
	}
	


}
