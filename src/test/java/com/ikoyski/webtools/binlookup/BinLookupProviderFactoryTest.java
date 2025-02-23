package com.ikoyski.webtools.binlookup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ikoyski.webtools.binlookup.provider.BinLookupProviderBaseInterface;
import com.ikoyski.webtools.binlookup.provider.BinLookupProviderFactory;

@SpringBootTest
class BinLookupProviderFactoryTest {

	@Autowired
	BinLookupProviderFactory binLookupProviderFactory;

	@Test
	@DisplayName("BinLookupProviderFactoryTest.binLookupProviderFactorySuccess()")
	void binLookupProviderFactorySuccess() {
		// when
		BinLookupProviderBaseInterface binLookupProvider = binLookupProviderFactory.createBinLookupProvider();

		// then
		Assertions.assertNotNull(binLookupProvider);
	}

	@Test
	@DisplayName("BinLookupProviderFactoryTest.binLookupProviderFactoryException()")
	void binLookupProviderFactoryException() {
		// when and then
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> binLookupProviderFactory.createBinLookupProvider("Dummy"));
	}
}
