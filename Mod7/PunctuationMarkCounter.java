package Mod7;

// Напиши клас PunctuationMarkCounter. У цьому класі створи метод public int count(String phrase).
// Він приймає рядок, і повертає кількість знаків пунктуації у цьому рядку.
//Знаками пунктуації вважаються наступні: ., ,, !, :, ;.

public class PunctuationMarkCounter {

    public int count(String phrase){
int count = 0;

if (phrase.contains(".")){
    count++;
}
if (phrase.contains(",")){
            count++;
        }
if (phrase.contains("!")){
            count++;
        }
if (phrase.contains(":")){
            count++;
        }
if (phrase.contains(";")){
            count++;
        }


return count;
    }

}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
