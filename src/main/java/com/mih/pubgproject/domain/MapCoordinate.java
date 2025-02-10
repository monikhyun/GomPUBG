package com.mih.pubgproject.domain;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MapCoordinate {

    private Double xCoordinate;

    private Double yCoordinate;

    @Override
    public String toString() {
        return "Coordinate{x=" + xCoordinate + ", y=" + yCoordinate + "}";
    }
}
