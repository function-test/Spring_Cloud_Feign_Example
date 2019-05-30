package io.github.mjyoun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringNetflixFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNetflixFeignApplication.class, args);
	}

}

