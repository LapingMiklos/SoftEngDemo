package edu.bbte.softeng.lmim2155.hex.adapter.in.web.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BreadInDto {
    @NotEmpty
    @Size(max = 256)
    private String name;

    @Min(0)
    @NotNull
    private Float weight;

    @Min(0)
    @NotNull
    private Float price;

    @Min(0)
    @NotNull
    private Long kcalCount;
}