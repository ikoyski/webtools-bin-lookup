package com.ikoyski.webtools.binlookup.provider;

import com.ikoyski.webtools.binlookup.dto.BinLookupResponse;

public interface BinLookupProviderBaseInterface {

	public static final String ERROR_INVALID_URI = "invalid uri";

	public BinLookupResponse getBinInfo(String bin);

}
