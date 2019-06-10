package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import com.app.service.INotificationService;

@SpringBootApplication
@Component
public class SpringProfileExampleApplication implements CommandLineRunner {
	
	@Autowired
	private INotificationService service;
	public static void main(String[] args) {
		SpringApplication.run(SpringProfileExampleApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		service.Notificate();
		
	}

	
}
