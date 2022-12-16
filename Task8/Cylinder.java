package Task8;

public class Cylinder extends Shape {

    private float radius;

    Cylinder(String name, float radius, String color) {
        this.name = name;
        this.radius = radius;
        this.color = color;
    }

    @Override
    String printName() {

        return this.name;
    }

    @Override
    String shapeInfo() {
        return "i have radius " + radius + "r , my color is " + color;
    }

    @Override
    public void sayName() {
        System.out.println("Hello my name is " + printName() + " " + shapeInfo());
    }
}
