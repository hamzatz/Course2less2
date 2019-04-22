package com.company.Figure;

public class Rectangle extends Figure implements Drawable {
    private double side1;
    private double side2;
    public Rectangle(String name,double side1, double side2) {
        super(name);
        this.side1=side1;
        this.side2=side2;
    }

    @Override
    public String draw() {
        char c = '\u2B1B';
        return String.valueOf(c) + String.valueOf(c);
    }

    @Override
    public double calculatePerimeter() {
        return (this.side1+this.side2)*2;
    }
}
