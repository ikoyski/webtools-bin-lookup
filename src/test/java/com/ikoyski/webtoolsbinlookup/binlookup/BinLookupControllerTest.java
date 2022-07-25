package com.ikoyski.webtoolsbinlookup.binlookup;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ikoyski.webtoolsbinlookup.controller.BinLookupController;
import com.ikoyski.webtoolsbinlookup.service.BinLookupService;

@SpringBootTest
public class BinLookupControllerTest {

	@Autowired
	private BinLookupController binLookupController;
	
	@MockBean
	private BinLookupService binLookupService;
	
	@Test
	@DisplayName("BinLookupControllerTest.getBinInfoSucces()")
	void getBinInfoSucces() {
		// given
		final String BIN = "542458";
		
		// when
		binLookupController.getBinInfo(BIN);
		
		// then
		verify(binLookupService).getBinInfo(BIN);
	}
	
}
