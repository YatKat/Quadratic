package com.yatkat.quadratic;

import com.yatkat.quadratic.model.QuadraticEquationModel;
import com.yatkat.quadratic.service.ComputeEquation;

public class Main {
    public static void main(String[] args) {
        QuadraticEquationModel model = ComputeEquation.compute(0,2,3);
        System.out.println(model.toString());
    }
}
