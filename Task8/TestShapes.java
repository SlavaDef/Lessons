package Task8;

public class TestShapes {

    public static void main(String[] args) {
        PrintMyShape printMyShape = new PrintMyShape();
        printMyShape.sayName(new Circle());
        printMyShape.sayName(new Quad());
        printMyShape.sayName(new Cylinder());
        printMyShape.sayName(new Oval());
        printMyShape.sayName(new Pyramid());
    }
}
