package Mod7;

import java.util.Arrays;

public class WordSplitter {

    public String[] split(String phrase){



// replaceAll("\\s+"," ") заменит все пробелы на один пробел,
// split(" ") - создаст массив по разделителю  в этом случае по пробелу

String [] word = phrase.replaceAll("\\s+"," ").toLowerCase().split(" ");


        return word;
    }
}
class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");
        String[] word = wordSplitter.split("You is sparta");
        //[hello, world]
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(word));
    }
}