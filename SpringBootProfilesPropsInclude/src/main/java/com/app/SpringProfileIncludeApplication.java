package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class SpringProfileIncludeApplication implements CommandLineRunner {
	@Value("${my.app.name}")
	private String appname;
	@Value("${my.db.driver}")
	private String dbdriver;
	@Value("${my.db.url}")
	private String url;
	@Value("${my.email.id}")
	private String email;
	@Value("${my.email.port}")
	private String port;
	
	@Override
	public String toString() {
		return "SpringProfileIncludeApplication [appname=" + appname + ", dbdriver=" + dbdriver + ", url=" + url
				+ ", email=" + email + ", port=" + port + "]";
	}
	public static void main(String[] args) {
		
		SpringApplication.run(SpringProfileIncludeApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
		
	}

}
