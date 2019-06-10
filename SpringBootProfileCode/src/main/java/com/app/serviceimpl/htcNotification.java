package com.app.serviceimpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;


@Profile("htc")
@Component
public class htcNotification implements INotificationService{

	public void Notificate() {
		System.out.println("HTC NotificationService........");
		
	}

}
