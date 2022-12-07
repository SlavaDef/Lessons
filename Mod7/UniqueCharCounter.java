package Mod7;



public class UniqueCharCounter {

    public int count(String phrase) {
        String res = "";

        int counter = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (res.indexOf(phrase.charAt(i)) == -1) { // если элемент уникальный
                res += phrase.charAt(i); // присваиваем его ресу а каунт ++
               // System.out.println(res);
                counter++;
            }

        }
        return counter;
    }

}
class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));

        System.out.println(charCounter.count("Ge74 g5sa Izew7 Fgi5lo"));
    }
}

/*
Метод з іменем count(String) класу UniqueCharCounter для вхідних даних "V7mu5 Ce13u P9 Iot352"
повертає невірне значення 0 , а повинен повертати 16
 */