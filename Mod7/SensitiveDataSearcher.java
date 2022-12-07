package Mod7;

public class SensitiveDataSearcher {

    public boolean isSensitiveDataPresent(String phrase){

        boolean res = false;

        String [] text = phrase.split(" ");

        for(String elm : text){
            if(elm.equalsIgnoreCase("pass")){
                res = true;
            }
            if(elm.equalsIgnoreCase("key")){
                res = true;
            }
            if(elm.equalsIgnoreCase("login")){
                res = true;
            }
            if(elm.equalsIgnoreCase("email")){
                res = true;
            }
        }



       return res;


    }
}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}