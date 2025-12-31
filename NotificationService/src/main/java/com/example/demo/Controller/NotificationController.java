package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
	
	@Autowired
	JavaMailSender javaMailSender;
	
	@GetMapping("notification/{email}/{message}")
	public String sendNotification(@PathVariable String email,@PathVariable String message)
	{
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setTo("prernakatole@gmail.com");
		mail.setFrom("prernakatole@gmail.com");
		mail.setSubject("about ticket enquiry");
		mail.setText("your ticket is booked");
		javaMailSender.send(mail);
		return "email sent";
	}

}
