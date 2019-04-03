package com.yatkat.quadratic.service;

import com.yatkat.quadratic.model.QuadraticEquationModel;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ComputeEquation {

    public static QuadraticEquationModel compute(int a, int b, int c) {
        QuadraticEquationModel equationModel = new QuadraticEquationModel(a, b, c);
        double discriminant = (double) (b * b - 4 * a * c);
        if (discriminant > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            equationModel.setResult1(x1);
            equationModel.setResult2(x2);
        } else if (discriminant == 0) {
            double x;
            x = -b / (2 * a);
            equationModel.setResult1(x);
        }
        return equationModel;
    }
}
