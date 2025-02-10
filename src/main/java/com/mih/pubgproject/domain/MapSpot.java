package com.mih.pubgproject.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class MapSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "map_id", nullable = false)
    private Map map;

    @ManyToOne
    @JoinColumn(name = "spot_id", nullable = false)
    private Spot spot;

    @ElementCollection
    @CollectionTable(name = "map_spot_coordinates", joinColumns = @JoinColumn(name = "map_spot_id"))
    private final List<MapCoordinate> coordinates = new ArrayList<>();
}
