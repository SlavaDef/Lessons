package Mod5;

import java.util.Objects;

class Point {

    private int x;
    private int y;
    private int z;

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }
    public int getZ(){
        return z;
    }

    public void setZ(int z){
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y && z == point.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}

class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(2);
        p1.setY(2);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(2);
        p2.setY(2);
        p2.setZ(1);

        System.out.println(p1.equals(p2)); //Will be false
    }
}
// Напиши клас StarTrack. Оголоси у цього класу два приватні поля типу Point з іменами start та finish.
// Напиши сеттери та геттери для цих полів.
//Реалізуй методи equals() та hashCode() для класу StarTrack. Два об'єкти StarTrack вважаються рівні
//, якщо у них рівні точки start та finish.

class StarTrack{
    private Point start; // приватное поле класса обьекта Point (другого класса)
    private Point finish; // приватное поле класса обьекта Point (другого класса)

    public void setStart(Point start){ //  в параметры сеттера передаем обьект с сылкой
        this.start = start;
    }

    public Point getStart(){ // ретурним ссылку на обьект
        return start;
    }
public void setFinish(Point finish){ //  в параметры сеттера передаем обьект с сылкой
        this.finish = finish;
}
   public Point getFinish(){ // ретурним ссылку на обьект
        return finish;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarTrack starTrack = (StarTrack) o;
        return Objects.equals(start, starTrack.start) && Objects.equals(finish, starTrack.finish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, finish);
    }
}