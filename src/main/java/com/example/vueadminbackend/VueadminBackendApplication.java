package com.example.vueadminbackend;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.vueadminbackend.Mapper")
public class VueadminBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueadminBackendApplication.class, args);
	}

}
