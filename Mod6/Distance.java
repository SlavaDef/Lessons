package Mod6;

public class Distance {

    private int startX;
    private int startY;

    private int endX;
    private int endY;

    public int getDistance(){
      double X = endX - startX;
      double Y = endY - startY;
      double S = 2;
      //double resalt = (Math.pow(X,S) + Math.pow(Y,S));
      //return (int) Math.round(Math.sqrt(resalt));
// в метод мат округление положили результат метода по добыванию корня в него результат метода по возведению в степень
return (int) Math.round(Math.sqrt((Math.pow(X,S) + Math.pow(Y,S))));
    }

    Distance(int startX, int startY, int endX, int endY){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }
}


class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}









/*
Ти продовжуєш писати гру Quarke. Тепер тобі треба написати кілька утилітних класів для геометричних розрахунків.
 Це ж ігри, і тут багато геометрії.

Використовуй клас Math зі стандартної бібліотеки Java для полегшення своєї роботи,
і вирішення цієї та наступних завдань. Якщо не знаєш, які методи використовувати –
пошукай офіційну документацію в Інтернеті, це частина щоденної роботи програміста.

Перше завдання, яке потрібно вирішити – навчитися рахувати відстань між двома точками.

Напиши клас Distance, у якого є конструктор Distance(int startX, int startY, int endX, int endY). Цей конструктор приймає 4 параметра - координати початкової точки (startX та startY), та координати кінцевої точки (endX та endY).

У класу також має бути метод public int getDistance(). Він повертає відстань між точками, координати яких передано до конструктора. Відстань округляється за правилами математичного округлення, повертається цілий результат.

виклик new Distance(10, 10, 20, 20).getDistance() повертає 14 (округлено від 14.142135623730951)
виклик new Distance(10, 10, 27, 25).getDistance() повертає 23 (округлено від 22.67156809750927)


 */