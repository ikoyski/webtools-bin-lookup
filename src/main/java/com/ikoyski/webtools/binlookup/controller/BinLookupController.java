package com.ikoyski.webtools.binlookup.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ikoyski.webtools.binlookup.dto.BinLookupResponse;
import com.ikoyski.webtools.binlookup.service.BinLookupService;

@RestController
public class BinLookupController {

	private final BinLookupService binLookupService;

	public BinLookupController(BinLookupService binLookupService) {
		this.binLookupService = binLookupService;
	}

	@GetMapping(path = "api/v1/binLookup/{bin}")
	@Cacheable(value = "binInfo", key = "#bin")
	public BinLookupResponse getBinInfo(@PathVariable("bin") String bin) {
		return binLookupService.getBinInfo(bin);
	}

}
