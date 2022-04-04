package com.isos.lss.app.conection.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.isos.lss.app.model")
public class IsosLssConectionDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsosLssConectionDbApplication.class, args);
	}

}
