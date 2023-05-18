package org.sid.radar.repositoy;

import org.sid.radar.entites.Radar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RadarRepository extends JpaRepository<Radar,Long> {
}

