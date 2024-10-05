package com.freddan.mediaproject_podservice.repositories;

import com.freddan.mediaproject_podservice.entities.Pod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodRepository extends JpaRepository<Pod, Long> {
    Pod findPodByUrl(String url);
}
