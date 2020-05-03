// MovieResource.java - (insert one line description here)
// (C) Copyright 2020 Hewlett Packard Enterprise Development LP

package com.javabrains.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.movieinfoservice.model.Movie;

/**
 *
 */
@RestController
@RequestMapping("/movies")
public class MovieResource
{

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") final String movieId)
    {
        return new Movie(movieId, "Test movie");
    }
}
