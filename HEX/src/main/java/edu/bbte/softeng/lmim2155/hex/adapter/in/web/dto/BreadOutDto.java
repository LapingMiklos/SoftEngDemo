package edu.bbte.softeng.lmim2155.hex.adapter.in.web.dto;

import lombok.Data;

@Data
public class BreadOutDto {
    private Long id;
    private String name;
    private Float weight;
    private Float price;
    private Long kcalCount;
}
