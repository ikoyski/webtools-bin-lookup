package com.ikoyski.webtools.binlookup;

import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.ikoyski.webtools.binlookup.dto.BinLookupCountry;
import com.ikoyski.webtools.binlookup.dto.BinLookupResponse;
import com.ikoyski.webtools.binlookup.provider.BinLookupProviderBaseInterface;
import com.ikoyski.webtools.binlookup.service.BinLookupService;

@SpringBootTest
class BinLookupServiceTest {

	@Autowired
	private BinLookupService binLookupService;

	@MockitoBean
	BinLookupProviderBaseInterface binLookupProvider;

	@Test
	@DisplayName("BinLookupServiceTest.getBinInfoSuccess()")
	void getBinInfoSuccess() {
		// given
		final String BIN = "542458";
		final String BIN_COUNTRY = "PH";
		BinLookupResponse binLookupResponse = new BinLookupResponse();
		BinLookupCountry binLookupCountry = new BinLookupCountry();
		binLookupCountry.setAlpha2(BIN_COUNTRY);
		binLookupResponse.setCountry(binLookupCountry);
		doReturn(binLookupResponse).when(binLookupProvider).getBinInfo(BIN);

		// when
		BinLookupResponse binLookupResponse2 = binLookupService.getBinInfo(BIN);

		// then
		Assertions.assertEquals(binLookupResponse2.getCountry().getAlpha2(), BIN_COUNTRY);
	}

}
