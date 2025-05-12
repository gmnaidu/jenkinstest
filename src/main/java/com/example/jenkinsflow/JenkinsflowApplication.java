package com.example.jenkinsflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsflowApplication {

     
    static Logger loggerr = LoggerFactory.getLogger(JenkinsflowApplication.class);


	@PostConstruct
	public void init(){

		loggerr.info("Application started...");
	}


	public static void main(String[] args) {
		loggerr.info("Application executed...");
		loggerr.info("Application executed with second commit...");
		SpringApplication.run(JenkinsflowApplication.class, args);
	}

}
