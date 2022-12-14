package Task8;

public class PrintMyShape implements Printable{
    @Override
    public void sayName(Shape shape) {
        shape.printName();
    }
}
