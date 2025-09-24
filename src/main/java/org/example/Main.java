package org.example;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(4,40);
        Rectangle rectangle3 = new Rectangle(3.5, 35.9);

        System.out.println("Прямоугольник 1:");
        System.out.println("Площадь: " + rectangle1.getArea());
        System.out.println("Периметр: " + rectangle1.getPerimeter());
        System.out.println();

        System.out.println("Прямоугольник 2:");
        System.out.println("Площадь: " + rectangle2.getArea());
        System.out.println("Периметр: " + rectangle2.getPerimeter());
        System.out.println();

        System.out.println("Прямоугольник 3:");
        System.out.println("Площадь: " + rectangle3.getArea());
        System.out.println("Периметр: " + rectangle3.getPerimeter());
    }
}
