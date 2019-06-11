package com.hsi.cvparse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.hsi.cvparse")
@EntityScan("com.hsi.cvparse.model")
@EnableJpaRepositories("com.hsi.cvparse.dao")

public class CvparseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvparseApplication.class, args);
		/*ICandidateinfodisplayservice service;
		System.out.println(service.getCandidateDetails().get(0).getName());
		System.out.println(service.getCandidateDetails().get(0).getEmail());
		System.out.println(service.getCandidateDetails().get(0).getMobile());*/
	}

}
