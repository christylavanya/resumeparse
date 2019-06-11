package com.hsi.cvparse.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hsi.cvparse.dto.CandidateInfoDto;

import com.hsi.cvparse.service.ICandidateservice;

@CrossOrigin
@RestController
@RequestMapping(value="/hsi/cvparse/candidateDetails")

public class CandidateController {
	
	private static final Logger LOG = LoggerFactory.getLogger(CandidateController.class);
	
	@Autowired
	ICandidateservice iCandidateservice;
	
	 
	
	
	@GetMapping(value = "/getCandidateDetails", produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CandidateInfoDto>> getCandidateDetails()
	{
		LOG.info("invoking getCandidateDetails service");
		return ResponseEntity.ok().body(iCandidateservice.getCandidateDetails());
	}
	
	@GetMapping(value = "/uploadCV")
	public ResponseEntity<List<CandidateInfoDto>> uploadCV() throws IOException {
		return ResponseEntity.ok().body(iCandidateservice.uploadCVFile());
	}
	
	


}
