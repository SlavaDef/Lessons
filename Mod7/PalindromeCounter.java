package Mod7;

public class PalindromeCounter {

    public int count(String phrase){


int count = 0;
        String [] words = phrase.split(" ");

        for (String element : words ){
            StringBuffer gg = new StringBuffer(element.toLowerCase());

            if(element.toLowerCase().contains(gg.reverse())){
                count++;
            }
        }
return  count;
    }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}
