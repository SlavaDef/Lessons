package Mod7;

public class AvgWordLength {


    public double count(String phrase){


        String[] text = phrase.split(" ");

        double lenText = text.length; // кол во слов

// колво символов - (колво слов_1 - избавляемся от пробелов) / деленное на общее количество слов
        double res = (phrase.length() - (lenText-1) )/ lenText;

        return res;
    }



}

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
