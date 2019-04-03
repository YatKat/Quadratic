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
    private Double result1;
    private Double result2;
}

