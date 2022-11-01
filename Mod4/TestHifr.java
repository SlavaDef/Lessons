package Mod4;

public class TestHifr {

    public String encode(String name){

        return "NOTFORYOU" + name
                .replace("e","1")
                .replace("u","2")
                .replace("i","3")
                .replace("o","4")
                .replace("a","5")

                +"YESNOTFORYOU";

    }

    public String decode(String name){

        return  name
                .replace("NOTFORYOU","")

                .replace("1","e")
                .replace("2","u")
                .replace("3","i")
                .replace("4","o")
                .replace("5","a")
                .replace("YES","");


    }

    public static void main(String[] args) {
        System.out.println(new TestHifr().encode("Bob"));
        System.out.println(new TestHifr().decode("NOTFORYOUB4bYESNOTFORYOU"));
    }


}
