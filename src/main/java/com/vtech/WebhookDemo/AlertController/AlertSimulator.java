package com.vtech.WebhookDemo.AlertController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtech.WebhookDemo.service.WebhookSenderService;

@RestController
@RequestMapping("/alert-simulator")
public class AlertSimulator {

	@Value("${local-host-url}")
	private String webHookUrl;

	@Autowired
	WebhookSenderService webhookSenderService;

	@GetMapping("/send-alert/{msg}")
	public String simulateAlert(@PathVariable String msg) {
		String responseCode = webhookSenderService.sendWebhook(webHookUrl, msg);
		return "Alert message sent to " + webHookUrl + " Response code : " + responseCode;
	}

}
