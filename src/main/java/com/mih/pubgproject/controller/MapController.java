package com.mih.pubgproject.controller;

import com.mih.pubgproject.domain.MapCoordinate;
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


}
