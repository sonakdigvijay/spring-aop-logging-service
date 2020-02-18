package com.learning;

import com.learning.service.MockAopTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopLoggingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopLoggingServiceApplication.class, args);
	}

}
