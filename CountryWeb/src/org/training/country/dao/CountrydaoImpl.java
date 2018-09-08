package org.training.country.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.training.country.beans.Country;
import org.training.country.staticdb.CountryDb;

public class CountrydaoImpl implements CountryDao {
	
	HashMap<Integer,Country> countryData=CountryDb.getCountryMap();

	@Override
	public List<Country> getAllCountries() {
		List<Country> countries= new ArrayList<Country>(countryData.values());
		return countries;
	}

	@Override
	public Country getCountry(int id) {
		
		return countryData.get(id);
	}

	@Override
	public Country addCountry(Country country) {
		countryData.put(country.getCountryID(), country);
		return country;
	}

	@Override
	public Country deleteCountry(int id) {
		Country c=countryData.remove(id);
		return c;
	}
	
}
	