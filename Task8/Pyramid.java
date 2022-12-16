package Task8;

public class Pyramid extends Shape{

    private String translation;

    Pyramid(String name, int corners, String translation) {
        this.name = name;
        this.corners = corners;
        this.translation = translation;

    }
    @Override
    String printName() {
        return this.name;
    }

    @Override
    String shapeInfo() {
        return "Number of corners is " + corners+ ", translation - " + translation;
    }

    @Override
    public void sayName() {
        System.out.println("Hello my name is " + printName() + ". "+ shapeInfo());
    }
}
