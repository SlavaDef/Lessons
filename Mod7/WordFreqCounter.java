package Mod7;

public class WordFreqCounter {

    public float countFreq(String phrase, String word){

float count = 0;


String[] maswords = phrase.split(" ");
for(String element : maswords){
    if(element.equalsIgnoreCase(word)){
        count++;
    }
}




      return count/maswords.length;
    }

}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java ", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}
