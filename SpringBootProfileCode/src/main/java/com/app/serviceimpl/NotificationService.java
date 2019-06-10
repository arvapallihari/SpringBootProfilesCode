package com.app.serviceimpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;


@Component
@Profile("default")
public class NotificationService implements INotificationService {

	
	public void Notificate() {
		// TODO Auto-generated method stub
		System.out.println("Default Notification Common For All.");
		
	}

}
