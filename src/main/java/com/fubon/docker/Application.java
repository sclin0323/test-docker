package com.fubon.docker;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.fubon.docker.config.HttpSessionConfig;
import com.fubon.docker.config.WebSecurityConfig;

@SpringBootApplication
@Import({ HttpSessionConfig.class, WebSecurityConfig.class })
@ComponentScan("com.fubon.docker.controller, com.fubon.docker.service")
@EnableMongoRepositories("com.fubon.docker.repository")
public class Application {

    public static void main(String[] args) {
        
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

		System.out.println("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
    }

}
