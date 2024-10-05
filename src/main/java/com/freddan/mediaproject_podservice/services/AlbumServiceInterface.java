package com.freddan.mediaproject_podservice.services;

import com.freddan.mediaproject_podservice.entities.Album;

import java.util.List;

public interface AlbumServiceInterface {
    List<Album> getAllAlbums();
    Album getAlbumByName(String name);
    boolean albumExist(String name);
    Album createAlbum(Album album);
}
