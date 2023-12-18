package edu.bbte.softeng.lmim2155.ml.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = "breads")
public class Bread extends BaseEntity {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Float weight;
    @Column(nullable = false)
    private Float price;
    @Column(nullable = false)
    private Long kcalCount;
}
