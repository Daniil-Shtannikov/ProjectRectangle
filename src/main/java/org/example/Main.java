package org.example;
import java.io.Console;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("Circle 1:");
        System.out.println(circle1.toString());
        System.out.println();


        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1:");
        System.out.println(rectangle1.toString());
        System.out.println();

        Triangle triangle1 = new Triangle();
        System.out.println("Triangle 1:");
        System.out.println(triangle1.toString());
        System.out.println();

        GeometricObject myShape;

        myShape = new Circle(5.0, "red", true);
        System.out.println(myShape.toString());
        System.out.println();

        myShape = new Rectangle(2.0, 3.0, "yellow", true);
        System.out.println(myShape.toString());
        System.out.println();

        myShape = new Triangle(3.0, 4.0, 5.0, "blue", true);
        System.out.println(myShape.toString());
    }
}