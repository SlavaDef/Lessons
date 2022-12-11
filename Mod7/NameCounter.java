package Mod7;

public class NameCounter {


    public int count(String text){

int count = 0;

String [] words = text.split(" ");

for(String elm : words){
    // якщо довжина слова більше дор 2, перший єлемент слова в верхньому регі, а другий у нижньому регі
    if(elm.length()>=2 & Character.isUpperCase(elm.charAt(0)) & Character.isLowerCase(elm.charAt(1))){
        count++;
    }
}



return count;
    }
}

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}

/*
При аналізі тексту важливо враховувати, скільки у ньому є власних назв - це імена людей, назви планет, і т.д.

Власним ім'ям вважається слово, в якому є хоча б дві літери. Перша літера має бути великою, решта - маленькими.

Напиши програму, яка рахуватиме кількість власних назв у тексті.

Напиши клас NameCounter. У цьому класі створи метод public int count(String text).
Він повертає кількість власних назв відповідно до алгоритму, описаного вище.

виконання коду new NameCounter().count("Mars is great planet") повертає 1;
виконання коду new NameCounter().count("Moon is near Earth") повертає 2;
виконання коду new NameCounter().count("SPACE IS GREAT") повертає 0.


 */