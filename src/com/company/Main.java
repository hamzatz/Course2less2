package com.company;

import com.company.Figure.*;

public class Main {

    public static void main(String[] args) {
        Monaliza monaliza= new Monaliza("Монализа");
        System.out.println(monaliza.getName()+" "+ ((Drawable)monaliza).draw());
        Dog dog = new Dog("Rex");
        System.out.println(dog.getName()+" "+ ((Drawable)dog).draw());
        Circle circle = new Circle("Круг",23);
        Triangle triangle= new Triangle("Треугольник2",10,4,7);
        Square square= new Square("Квадрат",60);
        Rectangle rectangle= new Rectangle("Прямоугольник",25,30 );
        Circle circle1 = new Circle("Круг2",55);
        Triangle triangle1= new Triangle("Треугольник",10,6,8);
        Figure figures[] =new Figure[]{circle,triangle,circle1, triangle1,square,rectangle,};
        for (Figure figure : figures) {
            System.out.println(figure.getName() +" "+ ((Drawable)figure).draw()+ figure.calculatePerimeter());
        }

    }

}
