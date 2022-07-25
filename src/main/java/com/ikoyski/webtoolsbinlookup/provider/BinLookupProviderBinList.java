package com.ikoyski.webtoolsbinlookup.provider;

import org.springframework.web.client.RestTemplate;

import com.ikoyski.webtoolsbinlookup.dto.BinLookupResponse;

public class BinLookupProviderBinList implements BinLookupProviderBaseInterface {

	@Override
	public BinLookupResponse getBinInfo(String bin) {
		String uri = "https://lookup.binlist.net/" + bin;
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri, BinLookupResponse.class);
	}

}
