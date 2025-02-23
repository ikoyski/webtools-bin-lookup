package com.ikoyski.webtools.binlookup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.ikoyski.webtools.binlookup.dto.BinLookupResponse;
import com.ikoyski.webtools.binlookup.service.BinLookupService;

@SpringBootTest
@ActiveProfiles("test")
class BinLookupServiceTest {

	@Autowired
	private BinLookupService binLookupService;

	@Test
	@DisplayName("BinLookupServiceTest.getBinInfoSuccess()")
	void getBinInfoSuccess() {
		// given
		final String BIN = "542458";
		final String BIN_COUNTRY = "PH";

		// when
		BinLookupResponse binLookupResponse = binLookupService.getBinInfo(BIN);

		// then
		Assertions.assertEquals(binLookupResponse.getCountry().getAlpha2(), BIN_COUNTRY);
	}

}
