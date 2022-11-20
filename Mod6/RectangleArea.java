package Mod6;

public class RectangleArea {

    int[] coords;

    public RectangleArea(int[] coords){
        this.coords = coords;
        /*int x = coords[0];
        int y = coords[1];
        int a = coords[2];
        int b = coords[3];*/
    }

    public int getArea(){


        return Math.abs((coords[2]-coords[0])*(coords[3]-coords[1]));
    }

}

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

/*
Важливо-необхідне завдання при розробці ігор - це підрахунок площі різних фігур.

Зокрема, слід рахувати площу прямокутників. Для оптимізації пам'яті прямокутники у грі
зберігаються як масив із 4-х елементів. Перші два елементи – це x та y першої точки прямокутника,
останні два елементи - це x та y протилежної точки.
RectangleArea(int[] coords). Перші два елемента - це x та y першої точки прямокутника,
останні два елементи - це x та y протилежної точки.

Цей клас має метод public int getArea(), який повертає площу прямокутника.

Виконання коду:

 int[] coords = {2, 2, 12, 12};
//Expect 100
System.out.println(new RectangleArea(coords).getArea());

 */