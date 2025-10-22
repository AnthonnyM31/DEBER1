package com.example.figuras;

public class Main {
    public static void main(String[] args) {

        IShape circulo = new Circle("Rojo", 5);
        IShape rectangulo = new Rectangle("Azul", 4, 6);
        IShape triangulo = new Triangle("Verde", 3, 4, 3, 4, 5);

        IShape[] figuras = { circulo, rectangulo, triangulo };

        for (IShape f : figuras) {
            System.out.println("Figura: " + f.nombre());
            System.out.println("Área: " + f.area());
            System.out.println("Perímetro: " + f.perimetro());
            System.out.println("----------------------------------");
        }
    }
}
