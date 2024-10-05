package com.freddan.mediaproject_podservice.services;

import com.freddan.mediaproject_podservice.entities.Artist;

import java.util.List;

public interface ArtistServiceInterface {
    List<Artist> getAllArtists();
    Artist getArtistByName(String name);
    boolean artistExists(String name);
    Artist createArtist(Artist artist);
}