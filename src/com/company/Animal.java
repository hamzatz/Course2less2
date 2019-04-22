package com.company;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String draw() {
        return null;
    }


}
