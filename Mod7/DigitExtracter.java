package Mod7;

import java.util.Arrays;

public class DigitExtracter {

    public int[] extract(String text) {

        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                counter++;
            }
        }



        int[] res = new int[counter];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) { // якщо сімвол є літра


                String name = ""+text.charAt(i); // робимо з цього char строку
                int d = Integer.parseInt(name); // переводимо її у int
                res[index] = d ; // додаемо в массив
                index++;
            }

        }
        return res;
    }

}
class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}