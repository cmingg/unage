package com.project.unage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.project.unage.repository"})
@SpringBootApplication
public class UnageApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnageApplication.class, args);
	}

}
