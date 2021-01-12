import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  {
        System.out.print("Enter the required number of shapes: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = 0;

        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        ShapeGenerator shapeGenerator = new ShapeGenerator(number);
    }
}
