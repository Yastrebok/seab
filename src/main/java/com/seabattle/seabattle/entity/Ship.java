package com.seabattle.seabattle.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ship {
    private int id;
    private int state;
    private String x;
    private int y;

}
