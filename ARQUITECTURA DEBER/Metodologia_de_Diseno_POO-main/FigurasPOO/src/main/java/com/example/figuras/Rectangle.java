package com.example.figuras;

public class Rectangle extends Shape {
    private double ancho;
    private double alto;

    public Rectangle(String color, double ancho, double alto) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double area() {
        return ancho * alto;
    }

    @Override
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    @Override
    public String nombre() {
        return "Rectángulo";
    }
}
