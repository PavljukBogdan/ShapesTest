package Shapes;

public class Square implements Shape {
    private int width;
    private int height;
    private String color;

    public Square(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void drawFigure() {
        System.out.println("this is square");
    }
    @Override
    public String toString() {
        return "Shapes.Shape: square, area - " + getArea() +
                "s.m., width - " + getWidth() + ", height - " + getHeight() +
                " color - " + getColor();
    }
}
