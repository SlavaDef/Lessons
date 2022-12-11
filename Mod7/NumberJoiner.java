package Mod7;

public class NumberJoiner {


    public String join(int[] numbers) {

        StringBuilder sb = new StringBuilder();

        for (int nub : numbers){
            sb.append(nub);
        }



return sb.toString();
    }
}
class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}

/*
25.7.
Над пошуковою системою Goo крім тебе працюють інші програмісти. Одне з твоїх завдань -
робити код-рев'ю їх роботи, і робити рефакторинг повільного або неправильно працюючого коду.

Ти знайшов приклад такого коду.

Є клас, який склеює масив чисел у рядок. Він працює правильно, але повільно,
тому що в циклі додає до рядка число. Постійно виділяється оперативна пам'ять,
і якщо давати на вхід великі (десятки тисяч даних) масиви чисел, то програма сповільниться.

Перепиши існуючий код класу NumberJoiner з використанням класу StringBuilder,
щоб позбутися конкатенації рядків у циклі. В іншому програма повинна працювати так само.

виконання коду new NumberJoiner().join(new int[] {10, 20, 30}) повертає рядок 102030;

 */