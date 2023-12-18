package edu.bbte.softeng.lmim2155.hex.application.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Bread extends BaseEntity {
    private String name;
    private Float weight;
    private Float price;
    private Long kcalCount;
}
