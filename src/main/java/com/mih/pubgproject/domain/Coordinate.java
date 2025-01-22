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

    private Long xCoordinate;

    private Long yCoordinate;

    private Long xDestination;

    private Long yDestination;

    public Coordinate(Long xCoordinate, Long yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
}
