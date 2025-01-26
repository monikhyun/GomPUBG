package com.mih.pubgproject.service;

import com.mih.pubgproject.domain.Coordinate;
import com.mih.pubgproject.domain.MapVehicle;
import com.mih.pubgproject.repository.MapRepository;
import com.mih.pubgproject.repository.MapVehicleRepository;
import com.mih.pubgproject.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class MapService {

    private final MapVehicleRepository mapVehicleRepository;
    private final VehicleRepository vehicleRepository;
    private final MapRepository mapRepository;

    public Long getMapIdByName(String mapName) {
        return mapRepository.findByMapName(mapName)
                .orElseThrow(() -> new IllegalArgumentException("Map not found"))
                .getMapId();
    }

    public Long getVehicleIdByName(String vehicleName) {
        return vehicleRepository.findByVehicleName(vehicleName)
                .orElseThrow(() -> new IllegalArgumentException("Vehicle not found"))
                .getVehicleId();
    }

    public List<Coordinate> getVehicleCoordinates(Long mapid, Long vehicleid) {
        List<MapVehicle> mapVehicles = mapVehicleRepository.findByMap_MapIdAndVehicle_VehicleId(mapid, vehicleid);

        return mapVehicles.stream()
                .flatMap(mapVehicle -> mapVehicle.getCoordinates().stream())
                .collect(Collectors.toList());
    }
}
