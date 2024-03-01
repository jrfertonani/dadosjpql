package com.pro.pro.uri2611.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "genres")
public class Genre {

    @Id
    private Long id;
    private String description;

    @OneToMany(mappedBy = "genre")
    private List<Movie> movies = new ArrayList<>();

    public Genre() {
    }

    public Genre(Long id, String description, List<Movie> movies) {
        this.id = id;
        this.description = description;
        this.movies = movies;
    }
}
