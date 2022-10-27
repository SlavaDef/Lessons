package Mod4;

public class Bool {



        public boolean areNumbersCool(int number1, int number2){

           return (number1*5+3)==number2;

        }

        //Test output
        public static void main(String[] args) {
            Bool helper = new Bool();
            System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(1, 9)); //Should be true
        }
    }


