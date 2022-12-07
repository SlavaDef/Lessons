package Mod7;

public class DoubleSpaceCleaner {

    public String clean(String phrase){

        return phrase.trim().replaceAll("\\s+"," ");
    }


}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}