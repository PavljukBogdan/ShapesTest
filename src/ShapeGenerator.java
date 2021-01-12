import Shapes.*;

import java.util.ArrayList;

public class ShapeGenerator {
    private int numberOfFigures;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public ShapeGenerator(int numberOfFigures) {
        this.numberOfFigures = numberOfFigures;
        createShapes();
        printShapes();
    }
    //створюємо фігури
    private void createShapes() {
        for (int i = 0; i < numberOfFigures; i++) {
            shapes.add(createShape(randomNumber(0,4)));
        }
    }
    //друкуємо фігури
    private void printShapes() {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
        }
    }
    //генератор фігур
    private Shape createShape(int typeShape) {

        Shape shape = null;
        switch (typeShape)  {
            case 0:
                shape = new Circle(randomNumber(1,10),getColor(randomNumber(0,3)));
                break;
            case 1:
                shape = new RightTrapeze(randomNumber(1,10),randomNumber(1,10),randomNumber(1,10), getColor(randomNumber(0,3)));
                break;
            case 2:
                shape = new RightTriangle(randomNumber(1,10),randomNumber(1,10), getColor(randomNumber(0,3)));
                break;
            case 3:
                shape = new Square(randomNumber(1,10),randomNumber(1,10),getColor(randomNumber(0,3)));
                break;
        }
        return shape;
    }
    //набір кольорів
    private String getColor(int number) {
        String color = null;
        switch (number)  {
            case 0:
                color = "red";
                break;
            case 1:
                color = "green";
                break;
            case 2:
                color = "blue";
                break;
            case 3:
               color = "yellow";
               break;
        }
        return color;
    }
    //випадкове число в межах від 0 до max
    private int randomNumber(int min, int max) {
            return min + (int) (Math.random() * max);
    }
}
