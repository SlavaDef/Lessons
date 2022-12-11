package Mod7;

import java.util.Arrays;

public class ObjectWorker {

    public String join(Object[] objects) {


        StringBuilder sb = new StringBuilder();



       // return sb.append(Arrays.asList(objects)).toString();

        return sb.append(objects).toString();
    }
}

class ObjectWorkerTest {
    public static void main(String[] args) {
        Object[] data = {"Hello", 20L, 3.14f, true};

        //Hello 20 3.14 true
        System.out.println(new ObjectWorker().join(data));
    }
}


/*


Під час налагодження програми корисно вивести значення різних об'єктів у консоль.
При цьому не хочеться замислюватися про тип об'єктів.

Ти знайшов клас, що робить саме це. Методу цього класу на вхід дається масив об'єктів типу Object,
він склеює їх у рядок (неявно викликається метод toString() у кожного об'єкта), і повертається отриманий рядок.

Проблема та сама, що й раніше - це робиться в циклі, через конкатенацію рядків.

Перепиши метод join(Object[] objects) класу ObjectWorker так, щоб уникнути конкатенації рядків у циклі, і використовувати замість цього клас StringBuilder.

виконання коду
Object[] data = {"Hello", 20L, 3.14f, true};

System.out.println(new ObjectWorker().join(data));
виводить у консоль Hello 20 3.14 true.

 */