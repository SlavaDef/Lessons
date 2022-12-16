package Task8;

public class Circle extends Shape {

    private float radius;

    Circle(String name, float radius, String color) {
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
        return "Circle havent corners, but have radius = " + radius + "r. My color is " + color;
    }

    @Override
    public void sayName() {
        System.out.println("Hello my name is " + printName() + ". " + shapeInfo());
    }
}
