package com.company.ljins;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan
public class LjinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LjinsApplication.class, args);
	}

}
