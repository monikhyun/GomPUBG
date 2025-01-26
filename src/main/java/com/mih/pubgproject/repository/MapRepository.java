package com.mih.pubgproject.repository;

import com.mih.pubgproject.domain.Map;
import com.mih.pubgproject.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MapRepository extends JpaRepository<Map, Long> {
    Optional<Map> findByMapName(String mapName);
}
