package com.example.helloworld.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages={"com.example.springidol",
							 "com.example.helloworld.service"}) 
@PropertySource("classpath:spring/app.properties")
public class ApplicationConfig {
	/* @ComponentScan 대신 아래와 같이 명시적 bean 설정 가능 */
	/*
	@Bean
	public HelloService helloService() {
		return new HelloService();
	}	
	*/
}
