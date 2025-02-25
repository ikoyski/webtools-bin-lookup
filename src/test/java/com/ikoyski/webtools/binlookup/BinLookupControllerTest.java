package com.ikoyski.webtools.binlookup;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.ikoyski.webtools.binlookup.controller.BinLookupController;
import com.ikoyski.webtools.binlookup.service.BinLookupService;

@SpringBootTest
@ActiveProfiles("test")
class BinLookupControllerTest {

	@Autowired
	private BinLookupController binLookupController;

	@MockitoBean
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
