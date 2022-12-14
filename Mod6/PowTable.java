package Mod6;
import java.util.Arrays;

public class PowTable {

    public static final int[] POWERS_2 = new int[10];

    static { // статический блок выполняеться до конструктора

        int numb = 1;
        for (int i = 0; i < POWERS_2.length; i++) { // тут инициализируем масив числами от 1 до 9
            POWERS_2[i] = i + 1;
        }
            for (int i = 0; i < POWERS_2.length ; i++) { // тут возводим их в квадрат
                POWERS_2[i] *= POWERS_2[i];
            }

        }
    }


class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
