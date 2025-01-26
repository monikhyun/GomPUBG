package com.mih.pubgproject.repository;

import com.mih.pubgproject.domain.MapVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapVehicleRepository extends JpaRepository<MapVehicle, Long> {

    List<MapVehicle> findByMap_MapIdAndVehicle_VehicleId(Long mapId, Long vehicleId);

}
