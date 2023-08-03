package com.angular.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.angular.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.angular.models.Movie;


@RestController
public class MovieRestController {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(MovieRestController.class);



	@GetMapping("/getMovie/{id}")
	public Optional<Movie> getMovieById(@PathVariable String id){
		LOGGER.info("***********getMovieById action called..");

		//Optional<Movie> movie= movieService.getMovieById(Long.parseLong(id));
		return null;
		
	}
	



}
