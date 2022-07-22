package com.ikoyski.webtoolsbinlookup.provider;

import com.ikoyski.webtoolsbinlookup.dto.BinLookupResponse;

public interface BinLookupProviderBaseInterface {

	public BinLookupResponse getBinInfo(String bin);

}
