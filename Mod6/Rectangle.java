package Mod6;

public class Rectangle {
    int a,b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect){



return   (anotherRect.a >= a | anotherRect.a >= b) & (anotherRect.b >= a | anotherRect.b >= b) & (anotherRect.a >= b | anotherRect.b >= b);

}
/*
boolean x = (a<=anotherRect.a) && (b<= anotherRect.b);
boolean y = (b<=anotherRect.a) && (a<= anotherRect.b);
return x||y;
*/

    }



class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(120, 150);
        Rectangle r2 = new Rectangle(120, 144);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}



/*

У гравця є рюкзак, де він носить їжу, боєприпаси та різні знайдені предмети.
Цей рюкзак прямокутний, і може вміщати предмети лише певного розміру, які не більші за рюкзак.
Предмети всередині гри також представлені прямокутною формою.

Тобі потрібно написати програму, яка б визначила, чи можна вкласти один прямокутник в інший.

Очевидно, що це можна зробити лише у випадку, якщо кожна сторона прямокутника, який ми вкладаємо,
менша або дорівнює одній із сторін прямокутника, куди ми вкладаємо.

Напиши клас Rectangle, у якого є конструктор public Rectangle(int a, int b).
Він приймає два параметри – сторони прямокутника.

Напиши метод public boolean canPlaceInto(Rectangle anotherRect). Він приймає інший прямокутник
і повертає true, якщо поточний прямокутник можна вписати у прямокутник anotherRect, та false в іншому випадку.



 */