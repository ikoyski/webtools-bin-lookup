package com.ikoyski.webtools.binlookup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ikoyski.webtools.binlookup.provider.BinLookupProviderBaseInterface;
import com.ikoyski.webtools.binlookup.provider.BinLookupProviderFactory;

@SpringBootTest
class BinLookupProviderFactoryTest {

	@Test
	@DisplayName("BinLookupProviderFactoryTest.binLookupProviderFactorySuccess()")
	void binLookupProviderFactorySuccess() {
		// given
		BinLookupProviderFactory binLookupProviderFactory = new BinLookupProviderFactory();

		// when
		BinLookupProviderBaseInterface binLookupProvider = binLookupProviderFactory
				.createBinLookupProvider(BinLookupProviderFactory.PROVIDER_BINLIST);

		// then
		Assertions.assertNotNull(binLookupProvider);
	}

	@Test
	@DisplayName("BinLookupProviderFactoryTest.binLookupProviderFactoryException()")
	void binLookupProviderFactoryException() {
		// given
		BinLookupProviderFactory binLookupProviderFactory = new BinLookupProviderFactory();

		// when and then
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> binLookupProviderFactory.createBinLookupProvider("Dummy"));
	}
}
