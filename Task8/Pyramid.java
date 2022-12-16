package Task8;

public class Pyramid extends Shape {

    private String translation;
    private int corners;

    Pyramid(String name, int corners, String translation, String color) {
        this.name = name;
        this.corners = corners;
        this.translation = translation;
        this.color = color;
    }

    @Override
    String printName() {
        return this.name;
    }

    @Override
    String shapeInfo() {
        return "Number of corners is " + corners + ", translation - " + translation;
    }

    @Override
    public void sayName() {
        System.out.println("Hello my name is " + printName() + ". " + shapeInfo());
    }
}
