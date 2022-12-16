package Task8;

import java.util.ArrayList;
import java.util.Arrays;

public class TestShapes {

    public static void main(String[] args) {

        new Circle("Circle", 32.2f, "Red").sayName();
        new Quad("Quad", 4, 22, "black").sayName();
        new Cylinder("Cylinder", 4.77f, "Green").sayName();
        new Oval("Oval", "white").sayName();
        new Pyramid("Piramid", 5, "Піраміда", "yellow").sayName();

        System.out.println("=======================================================================");
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Cylinder("Cylinder", 4f, "Green"));
        shapes.add(new Quad("Quad", 4, 22, "black"));
        shapes.add(new Circle("Circle", 45.7f, "Red"));
        shapes.add(new Oval("Oval", "white"));
        shapes.add(new Pyramid("Piramid", 5, "Піраміда", "yellow"));


        for (Shape shape : shapes) {
            PrintMyShape.sayName(shape);
        }

        System.out.println(Arrays.asList(shapes));
    }
}
