package Task8;

public class Cylinder extends Shape{

    private int corners;

    Cylinder(String name, int corners, String color) {
        this.name = name;
        this.corners = corners;
        this.color = color;
    }
    @Override
   String printName() {

        return this.name;
    }
    @Override
    String shapeInfo() {
        return "i dont know if i have "+corners + " corners, my color is " + color;
    }
    @Override
    public void sayName() {
        System.out.println("Hello my name is " + printName() + " " + shapeInfo() );
    }
}
