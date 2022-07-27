package com.ikoyski.webtoolsbinlookup.binlookup;

import com.ikoyski.webtoolsbinlookup.dto.BinLookupBank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BinLookupBankTest {

    @Test
	@DisplayName("BinLookupBankTest.binLookupBankSuccess()")
    void binLookupBankSuccess() {
        // given
        final String NAME = "SOME BANK";
        final String URL = "www.somebank.com";
        final String PHONE = "63-2-123-1234-12 OR 800-123-12345";
        BinLookupBank binLookupBank = new BinLookupBank();

        // when
        binLookupBank.setName(NAME);
        binLookupBank.setUrl(URL);
        binLookupBank.setPhone(PHONE);

        // then
        Assertions.assertEquals(binLookupBank.getName(), NAME);
        Assertions.assertEquals(binLookupBank.getUrl(), URL);
        Assertions.assertEquals(binLookupBank.getPhone(), PHONE);
    }
}