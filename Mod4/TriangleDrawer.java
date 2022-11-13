package Mod4;

public class TriangleDrawer {

    public String drawTriangle(int side){


     while (side>0) {
System.out.println("*".repeat(side));       // доработать другим способом


    side--;
}

       return "";
    }

    public static void main(String[] args) {
        TriangleDrawer td = new TriangleDrawer();
        String wor = td.drawTriangle(5);
        System.out.println(wor);
    }


}
