package Task8;
import java.util.ArrayList;
import java.util.Arrays;

public class TestShapes {

    public static void main(String[] args) {

        new Circle("Circle", 0, "Red").sayName();
        new Quad("Quad",4, 22).sayName();
        new Cylinder("Cylinder",4,"Green").sayName();
        new Oval("Oval", "white").sayName();
        new Pyramid("Piramid", 5,"Піраміда").sayName();

        ArrayList<Shape > shape = new ArrayList<>();

        shape.add(new Cylinder("Cylinder",4,"Green" ));
        shape.add(new  Quad("Quad",4, 22));
        shape.add( new Circle("Circle",0, "Red"));
        shape.add( new Oval("Oval","white"));
        shape.add(new Pyramid("Piramid", 5,"Піраміда" ));


        for (Shape shape1 : shape){
            shape1.sayName();
        }

      //  for (int i=0;i<shape.size();i++) {

         //   System.out.println(shape.get(i));
      //  }

        System.out.println(Arrays.asList(shape));
    }
}
