package Mod3;

import java.util.Arrays;

public class CaptainDisputeAgain {

    public int findMin(int[] triple){

int min = triple[0]<triple[1] ? triple[0]:triple[1]; // значение с индексом 1 меньше второго, если да то min == 1, нет мин стает 2 число
min = min < triple[2] ? min : triple[2]; // теперь прошлый мин сравниваем с третим элементов и ретурним результат
return min;


    }

    public static void main(String[] args) {
        int[] numbers = {10,44,8};
int search = new CaptainDisputeAgain().findMin(numbers);

        System.out.println(search);

    }

}
