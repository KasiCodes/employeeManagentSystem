package com.kasiCodes.employeeManagementSystem.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class mvcConfig implements WebMvcConfigurer{

    @Override
    public void addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
    }

    public void addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry registry) {
    
        registry.addViewController("/").setViewName("forward:/index.html");
    }

    


    
    
}
