package com.example.demo.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="NotificationService",url="http://localhost:8080")
public interface NotificationClient {

	@GetMapping("notification/{email}/{message}")
	public ResponseEntity sendNotification(@PathVariable String email,@PathVariable String message);
	
}
