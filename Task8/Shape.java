package Task8;

abstract class Shape implements Printable{

    abstract String printName();
    abstract String shapeInfo();

    protected String name;
    protected int corners;

    @Override
    public String toString() {
        return "The name of this shape is " + name + "corners = " + corners;
    }
}
