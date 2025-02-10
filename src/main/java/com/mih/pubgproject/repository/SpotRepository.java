package com.mih.pubgproject.repository;

import com.mih.pubgproject.domain.Map;
import com.mih.pubgproject.domain.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpotRepository extends JpaRepository<Spot, Long> {
    Optional<Spot> findBySpotName(String SpotName);
}
