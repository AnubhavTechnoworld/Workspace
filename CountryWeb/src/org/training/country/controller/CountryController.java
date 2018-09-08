package org.training.country.controller;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.training.country.beans.Country;
import org.training.country.service.CountryService;
import org.training.country.service.CountryServiceImpl;



@Path("/countries")
public class CountryController  {
	
	CountryService service= new CountryServiceImpl();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> getCountries()
	{
		return service.getAllCountries();
	}
	
	
	@Path("/greet")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUser()
	{
		return "Hello World";
		
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Country getCountry(@PathParam("id") int id)
	{
		return service.getCountry(id);
		
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Country addCountry(@FormParam("cid") int id,
	@FormParam("cname") String name,
	@FormParam("pop") long population ) {
		
		Country country = new Country();
		country.setCountryID(id);
		country.setCountryName(name);
		country.setPopulation(population);
		return service.addCountry(country);		
		
	}
	@POST
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public Country deleteCountry(@FormParam("id") int id)
	{
		return service.deleteCountry(id);
	}
	@Path("/{id}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Country getContry(@PathParam("id") int id)
	{
		return service.getCountry(id);
		
	}

}
