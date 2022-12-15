package Task8;

public class Pyramid extends Shape{
    @Override
    void printName() {
        System.out.println("Hello my name is Pyramid");
    }

    @Override
    public void sayName(Shape shape) {
        shape.printName();
    }
}
