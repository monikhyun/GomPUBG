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
public class DestinationCoordinate {

    private Double x_destinationCoordinate;

    private Double y_destinationCoordinate;

    @Override
    public String toString() {
        return "Coordinate{x=" + x_destinationCoordinate + ", y=" + y_destinationCoordinate + "}";
    }
}
