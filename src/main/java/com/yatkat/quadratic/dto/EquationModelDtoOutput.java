package com.yatkat.quadratic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquationModelDtoOutput {
    private int a;
    private int b;
    private int c;
    private Double root1;
    private Double root2;
}

