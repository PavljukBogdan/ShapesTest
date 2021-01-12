package Shapes;

public class RightTrapeze implements Shape {

    private int widthA;
    private int widthB;
    private int height;
    private String color;

    public RightTrapeze(int widthA, int widthB, int height, String color) {
        this.widthA = widthA;
        this.widthB = widthB;
        this.height = height;
        this.color = color;
    }

    public int getWidthA() {
        return widthA;
    }

    public int getWidthB() {
        return widthB;
    }

    public int getHeight() {
        return height;
    }

    public double getSide() {
        return Math.sqrt(Math.pow(this.height,2) + (Math.pow((this.widthA - this.widthB),2)));
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return ((this.widthA + this.widthB) / 2) * this.height;
    }

    @Override
    public void drawFigure() {
        System.out.println("this is trapeze");
    }
    @Override
    public String toString() {
        return "Shapes.Shape: right trapeze, area - " + getArea() +
                "s.m., width A - " + getWidthA() + ", width B - " + getWidthB() + ", height - " + getHeight() +
                ", side - " + getSide() + " color - " + getColor();
    }
}
