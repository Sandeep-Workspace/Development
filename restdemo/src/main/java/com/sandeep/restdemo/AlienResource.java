package com.sandeep.restdemo;


import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {

	AlienRepository repo =new AlienRepository();

	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Alien> getAliens() {

		System.out.println("getAlien called");

		return repo.getAliens();
	}

	@POST
	@Path("alien")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien createAlien(Alien a) {
		repo.createAlien(a);
		return a;
	}

	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien getAlien(@PathParam("id")int id) {

		System.out.println("getAlien called");

		return repo.getAlien(id);
	}

	@PUT
	@Path("alien")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien updateAlien(Alien a) {

		if(repo.getAlien(a.getId()).getId()==0) {
			repo.createAlien(a);
		}
		else {
			repo.updateAlien(a);
		}
		return a;
	}

	@DELETE
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien killAlien(@PathParam("id")int id) {

		Alien object =repo.getAlien(id);

		if(object.getId()!=0) {
			repo.deleteAlien(id);
			return object;
		}
		else {
			return new Alien();
		}
	}
}
