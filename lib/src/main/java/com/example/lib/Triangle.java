package com.example.lib;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    double P;
    double PP;
    double S;



    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void Perimetr(){
        P = getSide1() + getSide2() + getSide3();
        System.out.println("Perimetr = " + P);
    }
    public void SquareGeron(){
        PP= (getSide1() + getSide2() + getSide3())/2;
        S = Math.sqrt(PP*(PP-getSide1())*(PP-getSide2())*(PP-getSide3()));
        System.out.println("SquareGeron = " + S);
    }

    public static void main(String...args) {
        Triangle triangle = new Triangle(5, 4, 3);
        triangle.Perimetr();
        triangle.SquareGeron();
    }
}