package com.mih.pubgproject.controller;

import com.mih.pubgproject.domain.Coordinate;
import com.mih.pubgproject.service.MapService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/maps")
@RequiredArgsConstructor
public class MapController {

    private final MapService mapService;

    @GetMapping("/{mapname}")
    public String map(@PathVariable("mapname") String map, Model model) {
        model.addAttribute("mapname", map);
        return "maps/"+map;
    }

    @RestController  // REST API 메서드만 처리
    @RequestMapping("/maps")
    @RequiredArgsConstructor
    public static class MapRestController {
        private final MapService mapService;

        @GetMapping("/{mapname}/coordinates")
        public List<Coordinate> getCoordinates(
                @PathVariable String mapname,
                @RequestParam String vehicleName) {

            log.info("Received request for map: {}, vehicle: {}", mapname, vehicleName);

            Long mapId = mapService.getMapIdByName(mapname);
            Long vehicleId = mapService.getVehicleIdByName(vehicleName);

            List<Coordinate> coordinates = mapService.getVehicleCoordinates(mapId, vehicleId);
            log.info("Returning coordinates: {}", coordinates);

            return coordinates;
        }
    }
}
