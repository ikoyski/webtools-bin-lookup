package com.ikoyski.webtoolsbinlookup.provider;

public class BinLookupProviderFactory {

	public static final String PROVIDER_BINLIST = "BinList";

	public BinLookupProviderBaseInterface createBinLookupProvider(String type) {
		BinLookupProviderBaseInterface binLookupProvider;
		if (PROVIDER_BINLIST.equals(type)) {
			// using https://lookup.binlist.net/
			binLookupProvider = new BinLookupProviderBinList();
		} else {
			throw new IllegalArgumentException("No such provider.");
		}
		return binLookupProvider;
	}

}
