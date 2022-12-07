package Mod7;

import java.util.Arrays;

 class Phrase {

    private final String[] words;


    public  Phrase(String[] words){
this.words = Arrays.copyOf(words,words.length); // создали копию теперь обьект не исзменяем



    }

    @Override
    public  String toString() {

        StringBuffer res = new StringBuffer();
        for(String elment: words){
         res.append(elment).append(" ");
}


        return ""+res;
    }
}

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}