package com.company.Figure;

public class Square extends Figure implements Drawable {
    private double side;
    public Square(String name,double side) {
        super(name);
        this.side=side;
    }

    @Override
    public String draw() {
        return  "\u2B1B";
    }

    @Override
    public double calculatePerimeter() {
        return side*4;
    }
}
