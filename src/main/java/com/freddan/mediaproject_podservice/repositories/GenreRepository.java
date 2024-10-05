package com.freddan.mediaproject_podservice.repositories;

import com.freddan.mediaproject_podservice.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
    Genre findGenreByGenre(String genre);
}