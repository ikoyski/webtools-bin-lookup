package com.ikoyski.webtools.binlookup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.ikoyski.webtools.binlookup.dto.BinLookupResponse;
import com.ikoyski.webtools.binlookup.provider.BinLookupProviderBaseInterface;
import com.ikoyski.webtools.binlookup.provider.BinLookupProviderFactory;

@SpringBootTest
@ActiveProfiles("test")
class BinLookupProviderBinListTest {

	@Autowired
	BinLookupProviderFactory binLookupProviderFactory;

	@Test
	@DisplayName("BinLookupProviderBinListTest.binLookupProviderBinListSuccess()")
	void binLookupProviderBinListSuccess() {
		// given
		final String BIN = "542458";
		BinLookupProviderBaseInterface binLookupProvider = binLookupProviderFactory
				.createBinLookupProvider(BinLookupProviderFactory.PROVIDER_BINLIST);

		// when
		BinLookupResponse binLookupResponse = binLookupProvider.getBinInfo(BIN);

		// then
		Assertions.assertNotNull(binLookupResponse);
	}

	@Test
	@DisplayName("BinLookupProviderBinListTest.binLookupProviderBinListException()")
	void binLookupProviderBinListException() {
		// given
		final String BIN = "\\";
		BinLookupProviderBaseInterface binLookupProvider = binLookupProviderFactory
				.createBinLookupProvider(BinLookupProviderFactory.PROVIDER_BINLIST);

		// when and then
		Assertions.assertThrows(Exception.class, () -> binLookupProvider.getBinInfo(BIN));
	}

}
