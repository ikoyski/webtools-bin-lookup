package com.ikoyski.webtoolsbinlookup.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BinLookupProviderFactory {

	public static final String PROVIDER_BINLIST = "BinList";

	@Value("${provider.default}")
	private String PROVIDER_DEFAULT;

	public BinLookupProviderBaseInterface createBinLookupProvider() {
		return createBinLookupProvider(PROVIDER_DEFAULT);
	}

	public BinLookupProviderBaseInterface createBinLookupProvider(String type) {
		if (PROVIDER_BINLIST.equals(type)) {
			// using https://lookup.binlist.net/
			return new BinLookupProviderBinList();
		} else {
			throw new IllegalArgumentException("No such provider.");
		}
	}

}
