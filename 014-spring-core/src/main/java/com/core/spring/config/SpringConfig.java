package com.core.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.core.spring.controller.CompanyController;

@ComponentScan(basePackages = "com.core.spring")
@Configuration
public class SpringConfig {

}
