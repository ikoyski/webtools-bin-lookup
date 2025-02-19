package com.ikoyski.webtools.binlookup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikoyski.webtools.binlookup.dto.BinLookupResponse;
import com.ikoyski.webtools.binlookup.provider.BinLookupProviderBaseInterface;
import com.ikoyski.webtools.binlookup.provider.BinLookupProviderFactory;

@Service
public class BinLookupService {

	@Autowired
	BinLookupProviderFactory binLookupProviderFactory;

	public BinLookupResponse getBinInfo(String bin) {
		BinLookupProviderBaseInterface binLookupProvider = binLookupProviderFactory.createBinLookupProvider();
		return binLookupProvider.getBinInfo(bin);
	}

}
