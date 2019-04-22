package com.company.Figure;

public abstract class Figure {
    private String name;

    public String getName() {
        return name;
    }
    public abstract double calculatePerimeter();

    public Figure(String name){
        this.name=name;
    }
}
