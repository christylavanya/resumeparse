package com.hsi.cvparse.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hsi.cvparse.dto.CandidateInfoDto;

@Service
public interface ICandidateservice {
	
	List<CandidateInfoDto> getCandidateDetails();
	
	List<CandidateInfoDto> uploadCVFile() throws IOException;

}
