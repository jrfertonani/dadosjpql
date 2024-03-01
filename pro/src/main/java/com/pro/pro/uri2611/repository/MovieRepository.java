package com.pro.pro.uri2611.repository;

import com.pro.pro.uri2611.dto.MovieMinDTO;
import com.pro.pro.uri2611.entities.Movie;
import com.pro.pro.uri2611.projections.MovieMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query(nativeQuery = true, value = "SELECT movies.id, movies.name " +
            "FROM movies " +
            "INNER JOIN genres ON movies.id_genres = genres.id " +
            "WHERE genres.description = :genreName")
    List<MovieMinProjection> serach1(String genreName);

    @Query("SELECT new com.pro.pro.uri2611.dto.MovieMinDTO(obj.id, obj.name)" +
            "FROM Movie obj " +
            "WHERE obj.genre.description = :genreName")
    List<MovieMinDTO> serach2(String genreName);

}
