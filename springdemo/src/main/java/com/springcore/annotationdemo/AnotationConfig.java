package com.springcore.annotationdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.annotationdemo")
public class AnotationConfig {
	
}
