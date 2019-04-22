package com.company.Figure;

public class Triangle extends Figure implements Drawable {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(String name,double side1,double side2, double side3 ) {
        super(name);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public String draw() {
        return "\ud83d\udd3a";
    }

    @Override
    public double calculatePerimeter() {
        return side1+side2+side3;
    }
}
