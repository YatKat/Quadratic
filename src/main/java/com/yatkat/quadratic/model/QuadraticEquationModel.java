package com.yatkat.quadratic.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "results")
public class QuadraticEquationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int a;
    private int b;
    private int c;
    private Double result1;
    private Double result2;

    public QuadraticEquationModel(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
