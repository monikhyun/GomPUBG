package com.mih.pubgproject.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Map {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mapId;

    private String mapName;

    @OneToOne
    @JoinColumn(name = "spot_Id")
    private Spot spot;

    @OneToMany(mappedBy = "map", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MapVehicle> mapVehicles = new ArrayList<>();

    @Transient
    private MapCoordinate airplaneXY;

    @Lob // 대용량 데이터
    private byte[] mapData;

}
