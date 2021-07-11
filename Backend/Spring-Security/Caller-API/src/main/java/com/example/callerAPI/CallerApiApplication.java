package com.example.callerAPI;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.http.client.AbstractClientHttpResponse;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CallerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallerApiApplication.class, args);
	}

	@Bean
	public int callAndDisplayGetAPI() {

		String url = "http://localhost:8081/account/1";
		final RestTemplate restTemplate = new RestTemplate();

		String username = "Survhi";
		String password = "1234";
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth(username, password);

		HttpEntity<String> request = new HttpEntity<>(headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
		System.out.println(response.getBody());

		return 0;
	}
}
