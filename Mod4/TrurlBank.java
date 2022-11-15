package Mod4;

// 2.Напиши метод public int countSumOfDigits(int number). Він приймає число і повертає суму цифр цього числа.

public class TrurlBank {

    public int sumQuads(int n){

        int result = 0;

        while(n>0){
            result = result+(n*n);

           n--;
        }


      return  result;
    }

    public int countSumOfDigits(int number){

        int resalton = 0;

        while (number>0){

               resalton += number%10; // результат равен последней цифре
               number = number/10; // далее отсекаем последнюю цифру и все по новой
            //System.out.println(resalton+ " "+ number);
        }


        int result = 0;
        int count = 0;
        Integer numb = number; // класс обертка
        String word = numb.toString(); // переводим int в String


        while (count<word.length()){ // пока счетчик меньше длинны вход номера
         char c = word.charAt(count); // разбитие по симфолам
         String ofChar = Character.toString(c); // обратно с символа в String
         int parse = Integer.parseInt(ofChar); // со String в int

         result += parse; // подсчет
         count++;

        }


       return  resalton;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        // System.out.println(bank.sumQuads(3));

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(9999));
    }

}
