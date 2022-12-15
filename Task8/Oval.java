package Task8;

public class Oval extends Shape{
    @Override
    void printName() {
        System.out.println("Hello my name is Oval");
    }

    @Override
    public void sayName(Shape shape) {
        shape.printName();
    }
}
