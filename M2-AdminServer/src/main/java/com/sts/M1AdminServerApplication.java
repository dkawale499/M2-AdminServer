package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
@EnableAdminServer
@SpringBootApplication
public class M1AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(M1AdminServerApplication.class, args);
	}

}