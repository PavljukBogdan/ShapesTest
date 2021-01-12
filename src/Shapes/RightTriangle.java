package Shapes;

public class RightTriangle implements Shape {

    private int legA;
    private int legB;
    private String color;

    public RightTriangle(int legA, int legB, String color) {
        this.legA = legA;
        this.legB = legB;
        this.color = color;
    }

    public int getLegA() {
        return legA;
    }

    public int getLegB() {
        return legB;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(this.legA,2) + Math.pow(this.legB, 2));
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return (this.legA * this.legB) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("this is triangle");
    }
    @Override
    public String toString() {
        return "Shapes.Shape: right triangle, area - " + getArea() +
                "s.m., leg A - " + legA + ", leg B - " + legB + ", hypotenuse - " + getHypotenuse() +
                " color - " + getColor();
    }
}
