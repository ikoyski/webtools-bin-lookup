package com.ikoyski.webtoolsbinlookup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebtoolsBinLookupApplicationTests {

	@Test
	@DisplayName("WebtoolsBinLookupApplicationTests.contextLoads()")
	void contextLoads() {
	}

	@Test
	@DisplayName("WebtoolsBinLookupApplicationTests.mainSuccess()")
	void mainSuccess() {
		// when
		WebtoolsBinLookupApplication.main(new String[] {});
	}
}
