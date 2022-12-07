package Mod7;

public class ShortWordCounter {

    public int count(String phrase, int minLength){

        int count = 0;
        String [] ntext = phrase.split(" ");

        for(String element : ntext){
           if( element.length() <=minLength ){
               count++;
           }
        }
return  count;
    }
}
class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}