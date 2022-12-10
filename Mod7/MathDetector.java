package Mod7;

public class MathDetector {

    public boolean isMath(String text){
int count = 0;
for(int i = 0; i<text.length(); i++){
    if(Character.isDigit(text.charAt(i))){
        count++;
    }
}


        return text.contains("=") && count>1 | text.contains("+") && count>1 | text.contains("-") &&
                count>1 | text.contains("*") && count>1 | text.contains("/")&& count>1 ;

    }
}

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));

        System.out.println(new MathDetector().isMath("x-e=2"));
    }
}
