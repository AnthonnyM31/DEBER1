package com.example.figuras;

public class Circle extends Shape {
    private double radio;

    public Circle(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String nombre() {
        return "Círculo";
    }
}
