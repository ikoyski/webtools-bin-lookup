package com.ikoyski.webtoolsbinlookup.provider;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import com.ikoyski.webtoolsbinlookup.dto.BinLookupBank;
import com.ikoyski.webtoolsbinlookup.dto.BinLookupCountry;
import com.ikoyski.webtoolsbinlookup.dto.BinLookupResponse;

public class BinLookupProviderBinList implements BinLookupProviderBaseInterface {

	@Override
	public BinLookupResponse getBinInfo(String bin) {
		BinLookupResponse binLookupResponse = null;
		try {
			URI uri = new URI("https://lookup.binlist.net/" + bin);
			RestTemplate restTemplate = new RestTemplate();
			binLookupResponse = responseAdapter(
					restTemplate.getForObject(uri.toURL().toString(), BinListResponse.class));
		} catch (URISyntaxException | RestClientException | MalformedURLException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, BinLookupProviderBaseInterface.ERROR_INVALID_URI,
					null);
		}
		return binLookupResponse;
	}

	private BinLookupResponse responseAdapter(BinListResponse response) {
		BinLookupResponse binLookupResponse = new BinLookupResponse();
		binLookupResponse.setScheme(response.getScheme());
		binLookupResponse.setType(response.getType());
		binLookupResponse.setBrand(response.getBrand());

		binLookupResponse.setCountry(new BinLookupCountry());
		binLookupResponse.getCountry().setNumeric(response.getCountry().getNumeric());
		binLookupResponse.getCountry().setAlpha2(response.getCountry().getAlpha2());
		binLookupResponse.getCountry().setName(response.getCountry().getName());
		binLookupResponse.getCountry().setCurrency(response.getCountry().getCurrency());
		binLookupResponse.getCountry().setLatitude(response.getCountry().getLatitude());
		binLookupResponse.getCountry().setLongitude(response.getCountry().getLongitude());

		binLookupResponse.setBank(new BinLookupBank());
		binLookupResponse.getBank().setName(response.getBank().getName());
		binLookupResponse.getBank().setUrl(response.getBank().getUrl());
		binLookupResponse.getBank().setPhone(response.getBank().getPhone());

		return binLookupResponse;

	}

	public static class BinListResponse {

		private String scheme;
		private String type;
		private String brand;
		private Country country;
		private Bank bank;

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

		public Country getCountry() {
			return country;
		}

		public void setCountry(Country country) {
			this.country = country;
		}

		public Bank getBank() {
			return bank;
		}

		public void setBank(Bank bank) {
			this.bank = bank;
		}

		public static class Country {

			private String numeric;
			private String alpha2;
			private String name;
			private String currency;
			private String latitude;
			private String longitude;

			public String getNumeric() {
				return numeric;
			}

			public void setNumeric(String numeric) {
				this.numeric = numeric;
			}

			public String getAlpha2() {
				return alpha2;
			}

			public void setAlpha2(String alpha2) {
				this.alpha2 = alpha2;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCurrency() {
				return currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public String getLatitude() {
				return latitude;
			}

			public void setLatitude(String latitude) {
				this.latitude = latitude;
			}

			public String getLongitude() {
				return longitude;
			}

			public void setLongitude(String longitude) {
				this.longitude = longitude;
			}

		}

		public static class Bank {

			private String name;
			private String url;
			private String phone;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUrl() {
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getPhone() {
				return phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

		}

	}

}
