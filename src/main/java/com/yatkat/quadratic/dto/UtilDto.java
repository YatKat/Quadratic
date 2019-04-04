package com.yatkat.quadratic.dto;

import com.yatkat.quadratic.model.QuadraticEquationModel;

public class UtilDto {

    public static QuadraticEquationModel convertInputToModel(EquationModelDtoInput input) {
        QuadraticEquationModel model = new QuadraticEquationModel();
        model.setA(input.getA());
        model.setB(input.getB());
        model.setC(input.getC());
        return model;
    }

    public static EquationModelDtoOutput convertToOutput(QuadraticEquationModel model) {
        return new EquationModelDtoOutput(model.getA(), model.getB(), model.getC(),
                model.getResult1(), model.getResult2());
    }
}
