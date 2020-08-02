package com.sprin.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
public static Logger loger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	public void init() {
		loger.info("Application init method started.....");
	}


	public static void main(String[] args) {
		loger.info("Application main method started .......");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
