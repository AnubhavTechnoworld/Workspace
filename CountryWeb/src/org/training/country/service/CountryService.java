package org.training.country.service;

import java.util.List;

import org.training.country.beans.Country;

public interface CountryService {
	

	List<Country> getAllCountries();
	Country getCountry(int id);
	Country addCountry(Country country);
	Country deleteCountry(int id);

}
