package com.yatkat.quadratic.util;

import com.yatkat.quadratic.dto.EquationModelDtoInput;
import com.yatkat.quadratic.dto.EquationModelDtoOutput;
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
                model.getRoot1(), model.getRoot2());
    }
}
