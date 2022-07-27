package com.ikoyski.webtoolsbinlookup.binlookup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ikoyski.webtoolsbinlookup.dto.BinLookupBank;
import com.ikoyski.webtoolsbinlookup.dto.BinLookupCountry;
import com.ikoyski.webtoolsbinlookup.dto.BinLookupResponse;

@SpringBootTest
class BinLookupResponseTest {

	@Test
	@DisplayName("BinLookupResponseTest.binLookupResponseTestSuccess()")
	void binLookupResponseTestSuccess() {
		// given
		final String SCHEME = "mastercard";
		final String TYPE = "credit";
		final String BRAND = "Standard";
		BinLookupResponse binLookupResponse = new BinLookupResponse();

		BinLookupBank binLookupBank = new BinLookupBank();
		final String NAME = "SOME BANK";
		binLookupBank.setName(NAME);

		BinLookupCountry binLookupCountry = new BinLookupCountry();
		final String ALPHA2 = "PH";
		binLookupCountry.setAlpha2(ALPHA2);

		// when
		binLookupResponse.setScheme(SCHEME);
		binLookupResponse.setType(TYPE);
		binLookupResponse.setBrand(BRAND);
		binLookupResponse.setBank(binLookupBank);
		binLookupResponse.setCountry(binLookupCountry);

		// then
		Assertions.assertEquals(binLookupResponse.getScheme(), SCHEME);
		Assertions.assertEquals(binLookupResponse.getType(), TYPE);
		Assertions.assertEquals(binLookupResponse.getBrand(), BRAND);
		Assertions.assertEquals(binLookupResponse.getBank().getName(), NAME);
		Assertions.assertEquals(binLookupResponse.getCountry().getAlpha2(), ALPHA2);
	}
	
}
