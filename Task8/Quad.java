package Task8;

public class Quad extends Shape {

    private int size;

    Quad(String name, int corners, int size) {
        this.name = name;
        this.corners = corners;
        this.size = size;

    }
    @Override
    String printName() {
        return this.name;
    }

    @Override
    String shapeInfo() {
        return ", Quad have "+ corners + " corners "+ "and my size is about "+ size;
    }


    @Override
    public void sayName() {
        System.out.println("Hello my name is " + printName() + shapeInfo());
    }
}
