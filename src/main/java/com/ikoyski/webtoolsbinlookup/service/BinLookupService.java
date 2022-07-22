package com.ikoyski.webtoolsbinlookup.service;

import org.springframework.stereotype.Service;

import com.ikoyski.webtoolsbinlookup.dto.BinLookupResponse;
import com.ikoyski.webtoolsbinlookup.provider.BinLookupProviderBaseInterface;
import com.ikoyski.webtoolsbinlookup.provider.BinLookupProviderFactory;

@Service
public class BinLookupService {

	public BinLookupResponse getBinInfo(String bin) {
		BinLookupProviderBaseInterface binLookupProvider = BinLookupProviderFactory
				.createBinLookupProvider(BinLookupProviderFactory.PROVIDER_BINLIST);
		return binLookupProvider.getBinInfo(bin);
	}

}
