package Task8;

public class Quad extends Shape {
    @Override
    void printName() {
        System.out.println("Hello my name is Quad");
    }

    @Override
    public void sayName(Shape shape) {
        shape.printName();
    }
}
