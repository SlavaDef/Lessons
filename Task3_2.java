import java.util.Scanner;

public class Task3_2 {


    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int res1 = number1+number2;
        int res2 = number1-number2;
        int res3 = number1*number2;
        int res4 = number1/number2;

        System.out.print(res1 + " " + res2+ " " + res3+ " " + res4);

        scanner.close();
    }

    public static void main(String[] args) {
         new Task3_2().testMath();
    }


}
