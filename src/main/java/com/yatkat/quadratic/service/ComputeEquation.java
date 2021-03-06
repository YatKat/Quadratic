package com.yatkat.quadratic.service;

import com.yatkat.quadratic.model.QuadraticEquationModel;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ComputeEquation {

    public static QuadraticEquationModel compute(int a, int b, int c) {
        if (a == 0) {
            log.error("Arithmetic exception: division for 0");
            throw new ArithmeticException("Don't put 0 as a first argument to quadratic equation");
        }
        QuadraticEquationModel equationModel = new QuadraticEquationModel(a, b, c);
        double discriminant = (double) (b * b - 4 * a * c);
        if (discriminant > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            equationModel.setRoot1(x1);
            equationModel.setRoot2(x2);
        } else if (discriminant == 0) {
            double x;
            x = -b / (2 * a);
            equationModel.setRoot1(x);
        }
        return equationModel;
    }
}
