package Mod5;

public class FirTest {

    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNumFactorial();
        //FirNum firNum = new FirNumSum();
        FirTest firTest = new FirTest();
        System.out.println(firTest.test(firNum, 5));

        //Should be 6
       // System.out.println(firTest.test(firNum, 5));


    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
@Override
    public int calc(int n) {
    int[] numbers =  new int[n];
    int sum = 0;
   for (int i = 0; i<numbers.length; i++){
       numbers[i] = i+1; // заполнение массива
       sum +=numbers[i];
   }
    /*
     @Override
    public int calc(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
     */


        return sum;
    }
}

class FirNumFactorial extends FirNum{

    @Override
    public int calc(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        int result = n * calc(n - 1); // решение через факториал
        return result;

        /* int sum = 1;
        for(int i = 2; i<=n+1; i++){ // решение через цикл
            sum = sum*(i-1); }
            
           int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }


return sum; */
    }

}

/*
1. Створи клас FirNumSum, який успадковується від класу FirNum. Перевизнач у цього класу метод calc() так,
щоб він повертав суму чисел від 1 до переданого параметра n включно.
2. Наступна важлива-необхідна операція на планеті Фір - це факторіал числа.

Факторіал тут настільки популярний, що деякі жителі цієї планети навіть називають своїх дітей першими цифрами факторіалу якогось великого числа. Звучить дивно, але такі звичаї суворої планети Фір.

Нагадаємо, що факторіал числа N - це добуток усіх чисел від 1 до N включно. Наприклад, факторіал числа 5 - 120.

Факторіал числа 0 - 1.

Створи клас FirNumFactorial, який успадковується від класу FirNum. Перевизнач у цього класу метод calc() так, щоб він повертав факторіал n.

виклик new FirNumFactorial().calc(4) повертає 24
виклик new FirNumFactorial().calc(0) повертає 1
 */