package com.mih.pubgproject.domain;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coordinate {

    private Double xCoordinate;

    private Double yCoordinate;

    private Double xDestination;

    private Double yDestination;

    public Coordinate(Double xCoordinate, Double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public String toString() {
        return "Coordinate{x=" + xCoordinate + ", y=" + yCoordinate + "}";
    }
}
