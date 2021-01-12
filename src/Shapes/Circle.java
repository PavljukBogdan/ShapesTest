package Shapes;

public class Circle implements Shape {
    private int radius;
    private String color;
    private double PI = 3.14;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getDiameter() {
        return this.radius * 2;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("this is circle");
    }

    @Override
    public String toString() {
        return "Shapes.Shape: circle, area - " + getArea() + "s.m., diameter - " + getDiameter() + " color - " + getColor();
    }
}
