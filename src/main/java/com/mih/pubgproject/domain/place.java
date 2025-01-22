package com.mih.pubgproject.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long placeId;

    @ManyToOne
    @JoinColumn(name = "spot_id") // Spot 테이블의 외래 키
    private Spot spot;

    private List<Long> x = new ArrayList<>();

    private List<Long> y = new ArrayList<>();
}
