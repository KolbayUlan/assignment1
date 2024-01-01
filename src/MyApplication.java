import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        // implicit casting byte > short > int > long > float > double
        File file = new File("C:\\Users\\Ulan\\assignment1\\src\\source");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        while(sc.hasNextLine()){
            Point point = new Point(sc.nextDouble(), sc.nextDouble());
            shape.addPoint(point);

        }
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongestSide());
        System.out.println(shape.getAverageSide());
    }
}
