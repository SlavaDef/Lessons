package Mod4;

public class TestStringa {

    public static void main(String[] args) {

       /* String text = "ll 5123";
        String[] parts = text.split(" ");
        for(String word: parts) {
            System.out.println(word);
        }
        //int number1 = Integer.parseInt(parts[0]);
        int number2 = Integer.parseInt(parts[1]);
        System.out.println(parts[0]);
        System.out.println(parts[1]); */
int numb = 347;
Integer nub = 555;
//int res1 = numb%10; // получим последнее число
//int res2 = (numb/10)%10; // второе
//int res3 = numb/100; // первое
int res = (numb%10)+((numb/10)%10)+(numb/100) ;    // для трехзначных          // res1+res2+res3;

   // String text = nub.toString();

       // System.out.print(text.length());

        System.out.print(49%2);

    }
}
