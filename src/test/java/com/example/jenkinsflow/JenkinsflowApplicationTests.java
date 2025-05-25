package com.example.jenkinsflow;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsflowApplicationTests {

	Logger loggerr = LoggerFactory.getLogger(JenkinsflowApplicationTests.class);

	@Test
	void contextLoads() {
		loggerr.info("Testcases Executing...");
		loggerr.info("Testcases executed with second commit...");
		loggerr.info("Testcases executed with third commit...");
		assertTrue(true, "true");
	}



}
