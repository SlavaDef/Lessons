package Mod7;

/*
Напиши клас WordDeleter. У цього класу створи метод public String remove(String phrase, String[] words).
Цей метод приймає рядок phrase, який складається з окремих слів, розділених рівно одним пробілом,
і видаляє з неї всі слова, вказані в масиві words.

Повертається рядок без цих слів. Слова, що залишилися, повинні так само бути розділені рівно одним пробілом.


 */

import java.util.Arrays;

public class WordDeleter {

    public String remove(String phrase, String[] words){


String resalt = "";

String [] text = phrase.split(" ");


        for(int i = 0; i< text.length; i++){
            for(int j =0; j< words.length; j++){
                if(text[i].equals(words[j])){
                    text[i] = "";

                }
            }
        }

        for(String element : text){
            if(!element.equals("")) {

                resalt += element + " ";
            }
        }



return resalt.trim();

    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));

        System.out.println(wordDeleter.remove("This is Sparta and ", new String[] {"is","and"}));
    }
}
