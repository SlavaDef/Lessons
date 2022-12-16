package Task8;

public class Circle extends Shape{
    private String color;
    Circle(String name, int corners, String color) {
        this.name=name;
        this.corners = corners;
        this.color = color;
    }
    @Override
    String printName() {
        return this.name;
    }
    @Override
    String shapeInfo() {
        return "Circle havent corners, so we have "+ corners +". My color is "+ color;
    }
    @Override
    public void sayName() {
        System.out.println("Hello my name is " + printName() + ". "+ shapeInfo());
    }
}
