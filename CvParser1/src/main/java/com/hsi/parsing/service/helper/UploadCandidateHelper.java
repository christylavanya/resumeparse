package com.hsi.parsing.service.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hsi.parsing.model.CandidateInfo;

/**Parse - display all candidate details in html table
 * Candidate Service Implementation Helper class 
 **/
@Service
public class UploadCandidateHelper {
	
	//@Autowired
	//private DozerBeanMapper dozerBeanMapper;
	
public List<CandidateInfo> convertCSVtoPOJO(String file) throws IOException {
	
		
		
		List<CandidateInfo> allCandidateList = new ArrayList<>();
		
		CandidateInfo candidateEntity=new CandidateInfo();
		FileReader fileReader=null;
		try
		{
			 File filePath = new File(file);
		     File[] files = filePath.listFiles();
		     for(File f: files)
		    {
		    	System.out.println(f.getName()+" "+f.getAbsolutePath());
		    	BufferedReader br = new BufferedReader(new FileReader(file+f.getName()));
				String line;
				int lineNo=0;
			    while ((line = br.readLine()) != null) 
			    {
			    	//if (lineNo==0)
			    	//{
			    	//	lineNo++;
			    	//	continue;
			    	//}
			        String[] CurnextLine = line.split(",");
			        candidateEntity=buildAllCandidateEntity(CurnextLine);
			        allCandidateList.add(candidateEntity);
			        lineNo++;
			        System.out.println("candidate:"+CurnextLine[0]);
			    }
				
		    }
			
		}
		catch (Throwable ex) {
			System.out.println(ex.toString());
			//setErrorMsg(messageByLocaleService.getMessage("FEE_0003"));
			return null;
		}
		finally {
			if(fileReader != null) {
				fileReader.close();
			}
		}
		
		return allCandidateList;		
  
}


private CandidateInfo buildAllCandidateEntity(String[] metadata){
	CandidateInfo allCandidateInfo = new CandidateInfo();
	//allCandidateInfo = dozerBeanMapper.map(dto, CandidateInfoDto.class);
	allCandidateInfo.setName(metadata[0]);
	allCandidateInfo.setEmail(metadata[1]);
	allCandidateInfo.setMobile(metadata[2]);
	allCandidateInfo.setQualification(metadata[3]);
	allCandidateInfo.setExperience(metadata[4]);
	allCandidateInfo.setPrimarySkill(metadata[5]);
	allCandidateInfo.setSecondarySkill(metadata[6]);
	allCandidateInfo.setUploadedFileName(metadata[7]);	
	
	return allCandidateInfo;
}

}
