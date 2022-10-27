import java.util.Scanner;

public class ScanBoolean {

    public void testLogicalOperators(){

        Scanner scaner = new Scanner(System.in);

        boolean s = false;
        boolean a = scaner.nextBoolean();
        boolean b = scaner.nextBoolean();
        boolean c = scaner.nextBoolean();


        if(a==false & b==false & c==false) {
                s = false;
            }
          if(a==true & b==true & c==true) {
              s = true;
          }

        System.out.print(s + " ");
            if (a == true | b == true | c==true) {
                s = true;
            }
        System.out.print(s);

        scaner.close();
    }

    public static void main(String[] args) {

        new ScanBoolean().testLogicalOperators();
    }
}
