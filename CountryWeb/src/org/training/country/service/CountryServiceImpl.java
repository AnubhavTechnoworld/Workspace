package org.training.country.service;

import java.util.List;

import org.training.country.beans.Country;
import org.training.country.dao.CountryDao;
import org.training.country.dao.CountrydaoImpl;

public class CountryServiceImpl implements CountryService {
	
	CountryDao dao= new CountrydaoImpl();

	@Override
	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return dao.getAllCountries();
	}

	@Override
	public Country getCountry(int id) {
		// TODO Auto-generated method stub
		return dao.getCountry(id);
	}

	@Override
	public Country addCountry(Country country) {
		// TODO Auto-generated method stub
		return dao.addCountry(country);
	}

	@Override
	public Country deleteCountry(int id) {
		// TODO Auto-generated method stub
		return dao.deleteCountry(id);
	}

}
