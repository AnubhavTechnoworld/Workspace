package org.training.country.staticdb;

import java.util.HashMap;

import org.training.country.beans.Country;

public class CountryDb {
	
	static HashMap<Integer,Country> countryMap= new HashMap<Integer,Country>();

	public static HashMap<Integer, Country> getCountryMap() {
		return countryMap;
	}
	static {
		countryMap.put(1, new Country(1,"India",50000));
		countryMap.put(4, new Country(4,"Nepal",20000));
		countryMap.put(3, new Country(3,"China",70000));
		countryMap.put(2, new Country(2,"Canada",40000));		
	}
	
	

}
