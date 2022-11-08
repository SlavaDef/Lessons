package Mod4;

public class Facto {

    public static void main(String[] args) {

        int result = factorial(4);
        System.out.println(result);
    }


    static int factorial(int number){
if (number == 0 || number == 1){
    return 1;
}
int result = number * factorial(number - 1);
return result;



    }


}
