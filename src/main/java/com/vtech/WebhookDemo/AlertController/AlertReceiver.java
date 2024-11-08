package com.vtech.WebhookDemo.AlertController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alert-receiver")
public class AlertReceiver {

	@PostMapping("/msg")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void receiveAlertMessage(@RequestBody String str) {
		System.out.println("Received msg : " + str);
	}

}
