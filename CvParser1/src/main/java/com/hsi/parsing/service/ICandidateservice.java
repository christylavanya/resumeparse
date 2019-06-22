package com.hsi.parsing.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hsi.parsing.model.CandidateInfo;

/**Parse - display all candidate details in html table
 * Service Interface
 **/

@Service
public interface ICandidateservice {
	
	
	List<CandidateInfo> uploadCVFile() throws IOException;

}