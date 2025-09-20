package org.example;

public class Rectangle {
    private double Width, Height;

    public Rectangle(){
        Width = -1;
        Height= -1;
    }
    public Rectangle (double width, double height) {
        Width = width;
        Height = height;
    }

    public double getArea()
    {
        return Width*Height;
    }

    public double getPerimeter()
    {
        return (Width+Height)*2;
    }

}
