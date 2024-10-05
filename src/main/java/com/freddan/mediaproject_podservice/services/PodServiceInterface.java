package com.freddan.mediaproject_podservice.services;

import com.freddan.mediaproject_podservice.dto.PodDTO;
import com.freddan.mediaproject_podservice.entities.Album;
import com.freddan.mediaproject_podservice.entities.Artist;
import com.freddan.mediaproject_podservice.entities.Genre;
import com.freddan.mediaproject_podservice.entities.Pod;

import java.util.List;

public interface PodServiceInterface {

    List<Pod> findAllPods();
    List<Pod> findPodsByArtist(String artistName);
    List<Pod> findPodsByAlbum(String albumName);
    List<Pod> findPodsByGenre(String genreName);
    Pod findPodByUrl(String url);
    Pod findPodById(long id);
    Pod createPod(PodDTO podDTO);
    List<Genre> getAllGenres(PodDTO podDTO);
    List<Album> getAllAlbums(PodDTO podDTO);
    List<Artist> getAllArtists(PodDTO podDTO);
    Pod updatePod(long id, PodDTO newMusicInfo);
    String deletePod(long id);
    String playPod(String url);
    String likePod(String url);
    String disLikePod(String url);
    Boolean checkIfPodExistByUrl(String url);
}