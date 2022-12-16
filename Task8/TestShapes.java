package Task8;
import java.util.ArrayList;
import java.util.Arrays;

public class TestShapes {

    public static void main(String[] args) {

        new Circle("Circle", 0, "Red").sayName();
        new Quad("Quad",4, 22,"black").sayName();
        new Cylinder("Cylinder",4,"Green").sayName();
        new Oval("Oval", "white").sayName();
        new Pyramid("Piramid", 5,"Піраміда","yellow").sayName();

        ArrayList<Shape > shapes = new ArrayList<>();

        shapes.add(new Cylinder("Cylinder",4,"Green" ));
        shapes.add(new  Quad("Quad",4, 22,"black"));
        shapes.add( new Circle("Circle",0, "Red"));
        shapes.add( new Oval("Oval","white"));
        shapes.add(new Pyramid("Piramid", 5,"Піраміда","yellow" ));


        for (Shape shape1 : shapes){
            shape1.sayName();
        }

      //  for (int i=0;i<shape.size();i++) {

         //   System.out.println(shape.get(i));
      //  }

        System.out.println(Arrays.asList(shapes));
    }
}
