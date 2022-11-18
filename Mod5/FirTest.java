package Mod5;

public class FirTest {

    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        //FirNum firNum = new FirNumFactorial();
        //FirNum firNum = new FirNumSum();
       // FirTest firTest = new FirTest();
       // System.out.println(firTest.test(firNum, 5));

        //Should be 6
       // System.out.println(firTest.test(firNum, 5));

        //FirNum firNum = new FirNumFizzBuzz(); // создали обьект наследника
        //FirTest firTest = new FirTest();// создали обьект основного класса

        //Should be 83
        // обьект основного класса вызывает свой метод (в параметры помещаем ссылку на обьект класса
        // наследника и  число). Метод ретурнит (ссылка на обьект вызывает переопределенный метод обьекта на
        // коттором идет вызов)
        //System.out.println(firTest.test(firNum, 20));

        FirNum firNum = new FirNumBasis();
        FirTest firTest = new FirTest();
        System.out.println(firTest.test(firNum, 9));
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

class FirNumMultiplyOdd extends FirNum{

    @Override
    public int calc(int n) {

        int result = 1;
        for(int i = 1; i <= n; i++) {
           if(i%2==1) {
               result *= i;
           }
        }

        return result;
    }

}

class FirNumFizzBuzz extends FirNum{

    @Override
    public int calc(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 | i % 5 == 0) {
                if(i % 3 == 0 & i % 5 == 0){
                    continue;
                }
                result += i;
               // System.out.print(i+" "+ result + " ");
            }
        }
        /* for(int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 15 == 0)) {
                result += i;
            } */
        return result;

    }

}

class FirNumBasis extends FirNum{
    @Override
    public int calc(int n) {
        int resalt = 0;

        for(int i = 1; i<=n; i++){
            if(i % 2 == 0){
                resalt+=i;
            }
        }




        return resalt / 2;
    }
}

/*
1. Створи клас FirNumSum, який успадковується від класу FirNum. Перевизнач у цього класу метод calc() так,
щоб він повертав суму чисел від 1 до переданого параметра n включно.

2. Наступна важлива-необхідна операція на планеті Фір - це факторіал числа.

Факторіал тут настільки популярний, що деякі жителі цієї планети навіть називають своїх дітей першими
цифрами факторіалу якогось великого числа. Звучить дивно, але такі звичаї суворої планети Фір.

Нагадаємо, що факторіал числа N - це добуток усіх чисел від 1 до N включно. Наприклад, факторіал числа 5 - 120.

Факторіал числа 0 - 1.

Створи клас FirNumFactorial, який успадковується від класу FirNum. Перевизнач у цього класу метод calc() так,
щоб він повертав факторіал n.

виклик new FirNumFactorial().calc(4) повертає 24
виклик new FirNumFactorial().calc(0) повертає 1

3. Створи клас FirNumMultiplyOdd, який успадковується від класу FirNum. Перевизнач у цього класу метод calc()
так, щоб він повертав добуток непарних чисел від 1 до n включно.

4. Одне з найпопулярніших завдань, які просять написати на співбесіді Java-програмістів – це завдання FizzBuzz.

Одна з модифікацій цього завдання - порахувати суму чисел від 1 до n включно, але підсумовувати лише такі
числа, які діляться чи на 3, чи на 5, але не на 3 та 5 одночасно.

Наприклад, якщо взяти число 20, то можна виділити такі відповідні числа:

3, 5, 6, 9, 10, 12, 18, 20
І якщо порахувати суму цих чисел, то отримаємо 83.

Діти на планеті Фір змалку готуються до проходження співбесід. Напиши зразковий приклад такої програми
для них.
Створи клас FirNumFizzBuzz, який успадковується від класу FirNum. Перевизнач у цього класу метод calc() так,
щоб він повертав суму чисел від 1 до n включно згідно алгоритму FizzBuzz.

виклик new FirNumFizzBuzz().calc(20) повертає 83

5. Половина суми парних чисел від 1 до n включно на планеті Фір називається фірським базисом.

У вільний час математики планети Фір розважаються тим, що рахують фірські базиси для різних чисел. Допоможи їм,
напиши програму, яка б перевіряла їх розрахунки.
Створи клас FirNumBasis, який успадковується від класу FirNum. Перевизнач у цього класу метод calc() так,
шоб він повертав фірський базис числа n включно згідно алгоритму, описаному в теорії.

виклик new FirNumBasis().calc(9) повертає 10
 */