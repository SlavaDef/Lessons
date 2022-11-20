package Mod6;

import java.util.Objects;

public class CircleIntersector {

    int x1, y1, r1, x2,y2,r2;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2){
this.x1 = x1;
this.y1 = y1;
this.r1 = r1;
        this.x2 = x2;
        this.y2 = y2;
        this.r2 = r2;
    }



    @Override
    public String toString() {
        String resalt = "intersects";
        double S = 2;
        double X = x2-x1;
        double Y = y2-y1;

        double d =  (Math.sqrt((Math.pow(X,S) + Math.pow(Y,S))));


        if((r1+r2)< d || Math.abs(r2-r1)>d){
            resalt = "not intersects";
        }


        return resalt;
    }
}

class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}



/*
Коли відбувається вибух гранати в грі Quarke, шкода від гранати завдається всім предметам навколо
певного радіусу.

Кожен предмет, якому може бути завдано шкоди, представляється також у вигляді кола.

Як підсумок, при вибуху гранати нам потрібно для кожного предмета навколо зрозуміти,
чи буде йому завдано шкоди. А для цього потрібно перевірити, чи перетинаються два кола.
Якщо перетинаються - значить, шкода буде завдана.

Напиши клас CircleIntersector. Створи у цього класу конструктор public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2).

Параметри x1, y1, r1 - це координати першого кола. Параметри x2, y2, r2 - це координати другого кола.

Перевизнач метод toString() так, щоб він повертав intersects, якщо кола перетинаються, та not intersects, якщо не перетинаються.

виконання коду System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2)) виводить у консоль intersects;
виконання коду System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2)) виводить у консоль not intersects;
виконання коду System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2)) виводить у консоль not intersects.
(((r1+r2)>= ((x1+x2)+(y1+y2))) | ((r1-r2) == ((x1+x2)+(y1+y2))))

 */