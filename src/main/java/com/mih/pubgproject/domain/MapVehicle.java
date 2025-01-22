package com.mih.pubgproject.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class MapVehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "map_id", nullable = false)
    private Map map;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ElementCollection
    @CollectionTable(name = "map_vehicle_coordinates", joinColumns = @JoinColumn(name = "map_vehicle_id"))
    private final List<Coordinate> coordinates = new ArrayList<>();
}
