package org.training.country.controller;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/tests")
public class Tests {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greet(@MatrixParam("name") String user,@MatrixParam("city") String city) {
		return user+" "+city;
	}

}
