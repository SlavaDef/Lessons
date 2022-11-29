package Mod6;

import java.util.Arrays;

public class TargetFinder {

    public int[] findTarget(int[] aiCoords, int[][] targets){

        int coordA = 0;
        int coordB = 0;


int distanse = 0;


            for(int i = 0; i  <targets.length; i++) {

                if(targets[i][0] >= aiCoords[0] & targets[i][1] >= aiCoords[1]) {
                    int sideA = targets[i][0] - aiCoords[0];
                    int sideB = targets[i][1] - aiCoords[1];
                    distanse = (int) (Math.round(Math.sqrt((sideA * sideA) + (sideB * sideB))));
System.out.println(distanse);
                    if(distanse <10) {

                        coordA = targets[i][0];
                        coordB = targets[i][1];
                    }

                }
}

        return new int[] {coordA, coordB};
    }
}
class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {14, -35};
        int[][] targets = {
                {14, -34},
                {14, -33},
                {14, -13}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

/*
Наступне твоє завдання, пов'язане з ШІ. Коли комп'ютерний противник вибирає ціль атаки, він вибирає найближчу ціль.

Тобі потрібно написати метод, який приймає два параметри – координати ШІ (бота),
та координати точок потенційних цілей для нападу. Повертатиме він масив із двох чисел -
координати найближчої цілі. Якщо таких цілей кілька, повертай першу пару точок.

Напиши клас TargetFinder. Цей клас має метод public int[] findTarget(int[] aiCoords, int[][] targets). Цей метод приймає два параметри:

aiCoords - координати точки, де зараз перебуває ШІ. Це масив із двох елементів, x та y відповідно;
targets - двомірний масив. Кожен елемент масиву - це масив із двох елементів, x та y потенційної цілі відповідно.
Метод повертає точку найближчої цілі з масиву targets. Це масив із двох точок - x та y відповідно.





 */