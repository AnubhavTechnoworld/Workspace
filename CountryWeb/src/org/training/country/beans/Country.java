package org.training.country.beans;

public class Country {
	private int countryID;
	private String countryName;
	private long population;
	public int getCountryID() {
		return countryID;
	}
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public Country(int countryID, String countryName, long population) {
		super();
		this.countryID = countryID;
		this.countryName = countryName;
		this.population = population;
	}
	public Country() {		
	
	}
	

}
