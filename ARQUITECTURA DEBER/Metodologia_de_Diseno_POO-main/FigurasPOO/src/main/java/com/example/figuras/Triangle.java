package com.example.figuras;

public class Triangle extends Shape {
    private double base;
    private double altura;
    private double lado1, lado2, lado3;

    public Triangle(String color, double base, double altura, double lado1, double lado2, double lado3) {
        super(color);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String nombre() {
        return "Triángulo";
    }
}
