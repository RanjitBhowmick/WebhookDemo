package com.vtech.WebhookDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebhookSenderService {

	@Autowired
	private RestTemplate restTemplate;

	// Method to simulate sending a webhook event
	public String sendWebhook(String webhookUrl, String payload) {
		ResponseEntity<String> response = restTemplate.postForEntity(webhookUrl, payload, String.class);
		return response.getStatusCode().toString();
	}
}
