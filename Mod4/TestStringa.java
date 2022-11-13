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
        System.out.println(parts[1]);*/
int numb = 245;
int res1 = numb%10; // получим первое число
int res2 = (numb/10)%10; // второе
int res3 = numb/100; // третье
int res = res1+res2+res3;
        System.out.print(res);

    }
}
