package Mod4;

public class Ekranization {

    public static void main(String[] args) {

         //System.out.print("\'Hell\'"); // установили одинарные кавычки
        //System.out.print("\"Hell\""); // двойные
        //System.out.println("\\Hell\\"); // Символ обратной косой черты ( \ )

        // System.out.print("Hello\n" + "is\n" + "becose"); // после \n все будет на нов строчке

        //System.out.print("Can we delate last symbol in absd? "+ "abcd\b"); // abc
        /* System.out.print("2 + 2 = 5"); // На экране отображается 2 + 2 = 5
        System.out.print("\b");// На экране отображается 2 + 2 =
        System.out.print("4");// На экране отображается 2 + 2 = 4 */

       // System.out.print("\twhat does\t it mins?"); // установит 4 пробелла,    what does 	 it mins?

        /*System.out.print("Текст который необходимо переписать.");//На экране отображается "Текст который необходимо переписать."
        System.out.print('\r');//На экране пусто
        System.out.print("Новый текст.");//На экране отображается "Новый текст."*/

        //System.out.printf("Процент жирности молока : %d%%", 10);// задавая формат строки для отображения символа процента, необходимо продублировать символ процента – %%
String word = "\nKaka";
char w = word.charAt(0);
        System.out.print(w);
        System.out.print(word);


    }
}
