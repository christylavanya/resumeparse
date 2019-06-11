package com.hsi.cvparse.service.helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hsi.cvparse.dto.CandidateInfoDto;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import com.opencsv.enums.CSVReaderNullFieldIndicator;

@Service
public class UploadCandidateHelper {
	
public List<CandidateInfoDto> convertCSVtoPOJO(String file) throws IOException {
		
		List<CandidateInfoDto> allCandidateList = new ArrayList<>();
		
		CandidateInfoDto dto=new CandidateInfoDto();
		BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(file));
        while ((line = br.readLine()) != null) {

            // use comma as separator
            String[] row = line.split(cvsSplitBy);
            dto.setName(row[0]);
            dto.setEmail(row[1]);
            dto.setMobile(row[2]);
            dto.setQualification(row[3]);
            dto.setExperience(row[4]);
            dto.setPrimarySkill(row[5]);
            dto.setSecondarySkill(row[6]);
            dto.setResumePostedDate(row[7]);
            allCandidateList.add(dto);          
            
        }
        System.out.println(allCandidateList);
        br.close();

		/*String [] CurnextLine;
		String csvFilename2 = "./public/csvfile.csv";
        CSVReader reader2 = new CSVReader(new FileReader(csvFilename2));

        while ((CurnextLine = reader2.readNext()) != null) {

        	dto.setName(CurnextLine[0]);
            dto.setEmail(CurnextLine[1]);
            dto.setMobile(CurnextLine[2]);
            dto.setQualification(CurnextLine[3]);
            dto.setExperience(CurnextLine[4]);
            dto.setPrimarySkill(CurnextLine[5]);
            dto.setSecondarySkill(CurnextLine[6]);
            dto.setResumePostedDate(CurnextLine[7]);
            System.out.println(dto);
            allCandidateList.add(dto);
            
        }
        reader2.close();		*/
		return allCandidateList;
		
  
}

}
