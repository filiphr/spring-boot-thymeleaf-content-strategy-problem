package com.example.demothymeleaf;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoThymeleafApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	// If the @Controller in HomeController is not commented out then the test passes
	@Test
	public void contextLoads() {

		String response = restTemplate.getForObject("/", String.class);

		assertThat(response).contains("<link href=\"/custom-");
	}

}
