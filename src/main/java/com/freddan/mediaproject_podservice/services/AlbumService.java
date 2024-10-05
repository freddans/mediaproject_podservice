package com.freddan.mediaproject_podservice.services;

import com.freddan.mediaproject_podservice.entities.Album;
import com.freddan.mediaproject_podservice.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService implements AlbumServiceInterface {

    private AlbumRepository albumRepository;

    @Autowired
    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    public Album getAlbumByName(String name) {
        Optional<Album> optionalAlbum = albumRepository.findByNameIgnoreCase(name);

        return optionalAlbum.orElse(null);
    }

    public boolean albumExist(String name) {
        return albumRepository.existsByNameIgnoreCase(name);
    }

    public Album createAlbum(Album album) {
        return albumRepository.save(album);
    }
}
