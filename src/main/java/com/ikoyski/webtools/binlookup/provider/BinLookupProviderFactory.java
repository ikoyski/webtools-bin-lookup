package com.ikoyski.webtools.binlookup.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BinLookupProviderFactory {

	public static final String PROVIDER_BINLIST = "BINLIST";

	@Autowired
	BinLookupProviderBinList binLookupProviderBinList;

	@Value("${provider.default}")
	private String PROVIDER_DEFAULT;

	public BinLookupProviderBaseInterface createBinLookupProvider() {
		return createBinLookupProvider(PROVIDER_DEFAULT);
	}

	public BinLookupProviderBaseInterface createBinLookupProvider(String type) {
		if (PROVIDER_BINLIST.equals(type)) {
			// using https://lookup.binlist.net/
			return binLookupProviderBinList;
		} else {
			throw new IllegalArgumentException("No such provider.");
		}
	}

}
