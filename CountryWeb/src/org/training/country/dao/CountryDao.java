package org.training.country.dao;

import java.util.List;

import org.training.country.beans.Country;

public interface CountryDao {
	
	List<Country> getAllCountries();
	Country getCountry(int id);
	Country addCountry(Country country);
	Country deleteCountry(int id);
}
