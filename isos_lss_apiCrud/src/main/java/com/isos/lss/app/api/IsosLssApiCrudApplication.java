package com.isos.lss.app.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.isos.lss.app")
public class IsosLssApiCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsosLssApiCrudApplication.class, args);
	}

}
