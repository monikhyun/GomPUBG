package com.mih.pubgproject.controller;

import com.mih.pubgproject.domain.MapCoordinate;
import com.mih.pubgproject.service.MapService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // REST API 메서드만 처리
@Slf4j
@RequestMapping("/maps")
@RequiredArgsConstructor
public class MapRestController {
    private final MapService mapService;

    @GetMapping("/{mapname}/coordinates")
    public List<MapCoordinate> getCoordinates(
            @PathVariable String mapname,
            @RequestParam String vehicleName) {

        log.info("Received request for map: {}, vehicle: {}", mapname, vehicleName);

        Long mapId = mapService.getMapIdByName(mapname);
        Long vehicleId = mapService.getVehicleIdByName(vehicleName);

        List<MapCoordinate> coordinates = mapService.getVehicleCoordinates(mapId, vehicleId);
        log.info("Returning coordinates: {}", coordinates);

        return coordinates;
    }

    @GetMapping("/{mapname}/{supply}")
    public List<MapCoordinate> getSpotCoordinates(
            @PathVariable String mapname,
            @PathVariable String supply) {

        log.info("Received request for map: {}", mapname);

        Long mapId = mapService.getMapIdByName(mapname);
        Long spotId = mapService.getSpotIdByName(supply);

        List<MapCoordinate> coordinates = mapService.getSpotCoordinates(mapId, spotId);
        log.info("Returning coordinates: {}", coordinates);

        return coordinates;
    }
}