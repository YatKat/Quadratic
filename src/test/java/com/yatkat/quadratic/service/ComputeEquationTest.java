package com.yatkat.quadratic.service;

import com.yatkat.quadratic.model.QuadraticEquationModel;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeEquationTest {

    @Test
    public void computeOneRoot() {
        QuadraticEquationModel model = new QuadraticEquationModel(9,0,0);
        model.setResult1(0.0);
        model.setResult2(null);
        assertEquals(model, ComputeEquation.compute(9,0,0));
    }

    @Test
    public void computeTwoRoots() {
        QuadraticEquationModel model = new QuadraticEquationModel(1,3,2);
        model.setResult1(-2.0);
        model.setResult2(-1.0);
        assertEquals(model, ComputeEquation.compute(1,3,2));
    }

    @Test
    public void computeNoRoots() {
        QuadraticEquationModel model = new QuadraticEquationModel(2,3,5);
        model.setResult1(null);
        model.setResult2(null);
        assertEquals(model, ComputeEquation.compute(2,3,5));
    }

    @Test(expected = ArithmeticException.class)
    public void computeWithExceptionExpected() {
        ComputeEquation.compute(0,5,8);
    }
}