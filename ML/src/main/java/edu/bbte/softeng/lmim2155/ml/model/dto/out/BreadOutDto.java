package edu.bbte.softeng.lmim2155.ml.model.dto.out;

import lombok.Data;

@Data
public class BreadOutDto {
    private Long id;
    private String name;
    private Float weight;
    private Float price;
    private Long kcalCount;
}
