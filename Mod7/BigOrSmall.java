package Mod7;

public class BigOrSmall {

    public String calculate(String text){

String resalt = "Small";
int count = 0;
int count2 =0;
        for(int i=0; i<text.length(); i++){

            if (Character.isUpperCase(text.charAt(i)) ){
                count++;

            }

            if(Character.isLowerCase(text.charAt(i))) {
                count2++;
            }
        }


        if(count>count2){
            resalt = "Big";
        }
if(count==count2){
    resalt = "Same";
}

        return resalt;
    }
}
class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}