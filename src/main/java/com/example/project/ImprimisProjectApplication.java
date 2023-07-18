package com.example.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.project")
public class ImprimisProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImprimisProjectApplication.class, args);
	}

}
