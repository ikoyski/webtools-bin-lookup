package com.ikoyski.webtoolsbinlookup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ikoyski.webtoolsbinlookup.dto.BinLookupResponse;
import com.ikoyski.webtoolsbinlookup.service.BinLookupService;

@RestController
public class BinLookupController {

	private final BinLookupService binLookupService;

	public BinLookupController(BinLookupService binLookupService) {
		this.binLookupService = binLookupService;
	}

	@GetMapping(path = "api/v1/binLookup/{bin}")
	public BinLookupResponse getBinInfo(@PathVariable("bin") String bin) {
		return binLookupService.getBinInfo(bin);
	}

}
