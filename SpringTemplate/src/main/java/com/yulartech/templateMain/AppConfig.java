package com.yulartech.templateMain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.yulartech.helloworld.HelloWorld;
import com.yulartech.helloworld.HelloWorldImpl;

/*
 * 
 * Annotate with @Configuration to tell Spring that this is the core Spring configuration file, 
 * and define bean via @Bean.
 * 
 */
@Configuration
public class AppConfig {

	@Bean(name="helloBean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}
	
}
