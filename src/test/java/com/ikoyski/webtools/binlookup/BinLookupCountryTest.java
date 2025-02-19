package com.ikoyski.webtools.binlookup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ikoyski.webtools.binlookup.dto.BinLookupCountry;

@SpringBootTest
class BinLookupCountryTest {

	@Test
	@DisplayName("BinLookupCountryTest.binLookupCountrySuccess()")
	void binLookupCountrySuccess() {
		// given
		final String NUMERIC = "608";
		final String ALPHA2 = "PH";
		final String NAME = "Philippines";
		final String CURRENCY = "PHP";
		final String LATITUDE = "13";
		final String LONGITUDE = "122";
		BinLookupCountry binLookupCountry = new BinLookupCountry();

		// when
		binLookupCountry.setNumeric(NUMERIC);
		binLookupCountry.setAlpha2(ALPHA2);
		binLookupCountry.setName(NAME);
		binLookupCountry.setCurrency(CURRENCY);
		binLookupCountry.setLatitude(LATITUDE);
		binLookupCountry.setLongitude(LONGITUDE);
		
		// then
		Assertions.assertEquals(binLookupCountry.getNumeric(), NUMERIC);
		Assertions.assertEquals(binLookupCountry.getAlpha2(), ALPHA2);
		Assertions.assertEquals(binLookupCountry.getName(), NAME);
		Assertions.assertEquals(binLookupCountry.getCurrency(), CURRENCY);
		Assertions.assertEquals(binLookupCountry.getLatitude(), LATITUDE);
		Assertions.assertEquals(binLookupCountry.getLongitude(), LONGITUDE);
		
	}

}
