package com.ikoyski.webtoolsbinlookup.provider;

import com.ikoyski.webtoolsbinlookup.dto.BinLookupResponse;

public interface BinLookupProviderBaseInterface {

	public static final String ERROR_INVALID_URI = "invalid uri";

	public BinLookupResponse getBinInfo(String bin);

}
