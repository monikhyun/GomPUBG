package com.mih.pubgproject.repository;

import com.mih.pubgproject.domain.MapSpot;
import com.mih.pubgproject.domain.MapVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapSpotRepository extends JpaRepository<MapSpot, Long> {

    List<MapSpot> findByMap_MapIdAndSpot_SpotId(Long mapId, Long spotId);

}
