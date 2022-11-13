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

        int count = 0;

       // while (number){

       // }




       return count;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        // System.out.println(bank.sumQuads(3));

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }

}
