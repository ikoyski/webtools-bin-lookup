package com.ikoyski.webtoolsbinlookup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WebtoolsBinLookupApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebtoolsBinLookupApplication.class, args);
	}

}
