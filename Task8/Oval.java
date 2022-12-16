package Task8;

public class Oval extends Shape{

private String color;

    Oval(String name, String color) {
      this.name = name;
      this.color = color;

    }
    @Override
    String printName() {

        return this.name;
    }
    @Override
    String shapeInfo() {
        return "Oval color is " + color;
    }
    @Override
    public void sayName() {
        System.out.println("Hello my name is " + printName() + ". "+ shapeInfo());
    }
}
