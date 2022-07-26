package com.ikoyski.webtoolsbinlookup.provider;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import com.ikoyski.webtoolsbinlookup.dto.BinLookupResponse;

public class BinLookupProviderBinList implements BinLookupProviderBaseInterface {

	public static final String ERROR_INVALID_URI = "invalid uri";

	@Override
	public BinLookupResponse getBinInfo(String bin) {
		BinLookupResponse binLookupResponse = null;
		try {
			URI uri = new URI("https://lookup.binlist.net/" + bin);
			RestTemplate restTemplate = new RestTemplate();
			binLookupResponse = restTemplate.getForObject(uri, BinLookupResponse.class);
		} catch (URISyntaxException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, ERROR_INVALID_URI, null);
		}
		return binLookupResponse;
	}

}
