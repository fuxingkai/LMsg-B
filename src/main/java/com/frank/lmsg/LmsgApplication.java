package com.frank.lmsg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.frank.lmsg.mybatis.mapper")
public class LmsgApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsgApplication.class, args);
	}

}
