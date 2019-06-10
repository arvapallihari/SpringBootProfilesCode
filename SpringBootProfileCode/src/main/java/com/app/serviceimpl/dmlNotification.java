package com.app.serviceimpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;

@Component
@Profile("dml")
public class dmlNotification implements INotificationService {

	
	
	public void Notificate() {
		System.out.println("dml Notification Service.........");
		
	}

}
