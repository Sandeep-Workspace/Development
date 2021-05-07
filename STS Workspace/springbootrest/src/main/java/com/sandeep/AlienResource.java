package com.sandeep;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {

	@Autowired
	AlienRepository repo;

	@RequestMapping("alien")
	public List<Alien> getAliens(){

		List<Alien> aliens = (List<Alien>) repo.findAll();

		return aliens;
	}

	@RequestMapping(path="alien/{id}")
	public Alien getAlien(@PathVariable("id")int id){

		Optional<Alien> optionalEntity = repo.findById(id);

		Alien alien = optionalEntity.get();

		return alien;
	}

	@RequestMapping(path="alien",method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public int createAlien(@RequestBody Alien alien){
		System.out.println(repo.existsById(alien.getId()));
		if(repo.existsById(alien.getId())) {
			repo.save(alien);
		}

		return alien.getId();
	}


}
