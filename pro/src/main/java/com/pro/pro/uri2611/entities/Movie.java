package com.pro.pro.uri2611.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_genres")
    private Genre genre;

    public Movie() {
    }

    public Movie(Long id, String name, Genre genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }
}
