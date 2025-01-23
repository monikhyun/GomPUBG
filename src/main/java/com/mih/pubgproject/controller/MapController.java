package com.mih.pubgproject.controller;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/maps")
@RequiredArgsConstructor
public class MapController {

    @GetMapping("/{mapname}")
    public String map(@PathVariable("mapname") String map) {

        return "/maps/"+map;
    }
}
