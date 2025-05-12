package com.example.jenkinsflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsflowApplication {

     
    Logger logger = LoggerFactory.getLogger(JenkinsflowApplication.class);


	@PostConstruct
	public void init(){

		System.out.println("Post constructed called..... ");
	}


	public static void main(String[] args) {
		SpringApplication.run(JenkinsflowApplication.class, args);
	}

}
