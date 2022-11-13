package Mod4;

/*   Настав час рішучих дій. Власник інтернет-магазину вирішив залишити ті товари, які коштують менше ніж 200 монет.

        Тільки ось невдача - всі товари та ціни на них передані рядками. Спочатку йде назва товару, потім,
        через один пробіл - ціна, ціле число.

        Тобі ж потрібно повернути один рядок, де рівно через один пробіл зібрані назви товарів, ціна яких
        менша ніж 200 одиниць.
        У вирішенні цього завдання тобі допоможе метод split() класу String, який розділить рядок на дві
        частини через пробіл. А щоб перевести рядок у число, ти можеш використати статичний
        метод Integer.parseInt(). Наприклад:

        String text = "123 456";
        String[] parts = text.split(" ");
        int number1 = Integer.parseInt(parts[0]); //123
        int number2 = Integer.parseInt(parts[1]); //456

Напиши клас CheapStocks. Створи в ньому метод public String getCheapStocks(String[] stocks).
Він приймає на вхід масив рядків. Кожен рядок складається з назви товару та його ціни, розділених одним пробілом.

        Метод повертає рядок - список назв товарів, ціна яких менша ніж 200.

        виклик getCheapStocks(new String[] {"gun 500", "firebow 70", "pixboom 200"}) повертає "firebow"

        використовувати можна тільки цикл for */



public class CheapStocks {

    String ansver;
    public String getCheapStocks(String[] stocks){
//int count = 0;

        for(int i = 0; i<stocks.length; i++) {

            String[] parts = stocks[i].split(" ");

            int numb = Integer.parseInt(parts[1]);//

            if (numb < 200) {
                //count++;
                ansver = parts[0];
                System.out.print(ansver + " ");

               // return ansver;
            }
        }

return "";

    }

    public static void main(String[] args) {
        CheapStocks cp = new CheapStocks();
        String [] word = {"gun 50", "firebow 70", "pixboom 20"};
        String w = cp.getCheapStocks(word);
        System.out.print(w);
    }

}
