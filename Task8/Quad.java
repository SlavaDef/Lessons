package Task8;

public class Quad extends Shape {

    private int size;
    private int corners;

    Quad(String name, int corners, int size, String color) {
        this.name = name;
        this.corners = corners;
        this.size = size;
        this.color = color;
    }

    @Override
    String printName() {
        return this.name;
    }

    @Override
    String shapeInfo() {
        return ", Quad have " + corners + " corners " + "and my size is about " + size;
    }

    @Override
    public void sayName() {
        System.out.println("Hello my name is " + printName() + shapeInfo());
    }
}
