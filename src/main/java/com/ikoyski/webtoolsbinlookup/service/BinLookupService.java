package com.ikoyski.webtoolsbinlookup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikoyski.webtoolsbinlookup.dto.BinLookupResponse;
import com.ikoyski.webtoolsbinlookup.provider.BinLookupProviderBaseInterface;
import com.ikoyski.webtoolsbinlookup.provider.BinLookupProviderFactory;

@Service
public class BinLookupService {

	@Autowired
	BinLookupProviderFactory binLookupProviderFactory;

	public BinLookupResponse getBinInfo(String bin) {
		BinLookupProviderBaseInterface binLookupProvider = binLookupProviderFactory.createBinLookupProvider();
		return binLookupProvider.getBinInfo(bin);
	}

}
