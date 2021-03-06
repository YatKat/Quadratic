package com.yatkat.quadratic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "results")
public class QuadraticEquationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int a;
    private int b;
    private int c;
    private Double root1;
    private Double root2;

    public QuadraticEquationModel(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
