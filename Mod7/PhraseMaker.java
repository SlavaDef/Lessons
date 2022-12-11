package Mod7;

public class PhraseMaker {

    public String join(String[] words) {


StringBuilder sb = new StringBuilder();

for(String elm  : words){
    if(elm.length()>3){
        elm = elm.toLowerCase();

        sb.append(elm).append(" ");
    }else {
       elm =  elm.toUpperCase();
        sb.append(elm).append(" ");
    }
}



        return sb.toString().trim(); // toString() для виазуализации, trim() убрал пробел в конце
    }
}

class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}


/*

Ти продовжуєш розгрібати код пошукової системи Goo і знайшов цікаве місце.

Є метод, який приймає масив слів, і робить із них рядок, розділяючи слова пробілами.
При цьому слова перетворюються. Якщо слово довше ніж 3 символи, воно наводиться в нижній регістр.
Інакше воно наводиться у верхній регістр.

Програма працює правильно, але повільно. Якщо дати їй на вхід масив завдовжки десятки тисяч рядків,
це буде помітно. Це відбувається через конкатенацію рядків у циклі.

Перепиши існуючий код класу PhraseMaker з використанням класу StringBuilder, щоб позбутися конкатенації рядків у циклі. В іншому програма повинна працювати так само.

Виконання коду

 String[] words = {"Life", "is", "great", "thing"};

System.out.println(new PhraseMaker().join(words));
виводить у консоль life IS great thing.


 */