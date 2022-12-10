package Mod7;

public class DigitText {

    public boolean detect(String text){
boolean res = false;
int counter = 0;

for(int i = 0; i<text.length(); i++){ // если ли символ цифра ( isDigit ) и не пустая ли строка
    if( Character.isDigit(text.charAt(i)) | Character.isWhitespace(text.charAt(i))){
        counter++;
    }

    if(counter==text.length()){
        res = true;
    }
}


return res;

    }
}

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("236565656565 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
