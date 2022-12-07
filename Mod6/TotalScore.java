package Mod6;

public class TotalScore {

    public int sum(int[] scores){ //throws IndexOutOfBoundsException {
        int result = 0;
        int index = 0;


        while (true) {

            result += scores[index++];

            if (index > scores.length-1) {

                break;
            }


        }


        return result;

    }
}

class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}


