package com.ikoyski.webtools.binlookup.dto;

public class BinLookupResponse {

	private String scheme;
	private String type;
	private String brand;
	private BinLookupCountry country;
	private BinLookupBank bank;

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public BinLookupCountry getCountry() {
		return country;
	}

	public void setCountry(BinLookupCountry country) {
		this.country = country;
	}

	public BinLookupBank getBank() {
		return bank;
	}

	public void setBank(BinLookupBank bank) {
		this.bank = bank;
	}

}
