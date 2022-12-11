package Mod7;

public class PalindromeDetector {

    public boolean isPalindrome(String word) {

        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word){

        StringBuilder sb = new StringBuilder(word);

      return sb.reverse().toString();



    }
}

class PalindromeDetectorTest {
    public static void main(String[] args) {
        //false
        System.out.println(new PalindromeDetector().isPalindrome("Java"));

        //true
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));
    }


}


/*
Наступний кандидат на виправлення – клас PalindromeDetector. Цей клас має метод isPalindrome(String word),
який приймає рядок, і повертає true, якщо передане слово є паліндромом (читається однаково з будь-якої сторони).

Алгоритм роботи простий. Береться вихідний рядок, розгортається (використовуючи метод reverse(String word)
із класу PalindromeDetector), і цей розгорнутий рядок порівнюється з оригінальним,
використовуючи метод equalsIgnoreCase().

Проблема саме у методі reverse(String word). Усередині цього методу рядок розбивається на масив символів,
і далі у циклі все це склеюється в новий рядок.

На великих даних такий підхід призведе до проблем.

Водночас у класу StringBuilder є зручний метод reverse(), який ідеально вирішує це вузьке завдання.

Перепиши метод reverse(String word) у класі PalindromeDetector, щоб позбавитися від циклу,
і використати метод reverse() класу StringBuilder для розгортання рядка.

виконання коду new PalindromeDetector().isPalindrome("Java") повертає false;
виконання коду new PalindromeDetector().isPalindrome("Noon") повертає true

 */