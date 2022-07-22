package com.ikoyski.webtoolsbinlookup.provider;

public class BinLookupProviderFactory {

	public static final String PROVIDER_BINLIST = "BinList";

	public static BinLookupProviderBaseInterface createBinLookupProvider(String type) {
		BinLookupProviderBaseInterface binLookupProvider;
		switch (type) {
		case PROVIDER_BINLIST:
			// using https://lookup.binlist.net/
			binLookupProvider = new BinLookupProvider_BinList();
			break;
		default:
			throw new IllegalArgumentException("No such provider.");

		}
		return binLookupProvider;
	}

}
