package Mod5;

public class SeasonTest {

    // метод принимает обьект и ретурнит вызов методов обьектаю
    // сигнатура ретурна ( вызов первого метода + второй в тонарном представлении
    public String test(Season season) {
        return season.getName() + (season.isCold() ? " is cold" : " is warm");
    }

    public static void main(String[] args) {
        SeasonTest seasonTest = new SeasonTest(); // создаем обьект

        //Should be winter is cold
        System.out.println(seasonTest.test(new Winter()));

        //Should be spring is warm
        System.out.println(seasonTest.test(new Spring()));

        //Should be summer is warm
        System.out.println(seasonTest.test(new Summer()));

        //Should be autumn is cold
        System.out.println(seasonTest.test(new Autumn()));
    }
}

abstract class Season {
    public abstract String getName();
    public abstract boolean isCold();
}
// наследуемся от абстрактного класса  и реализуем его методы(они уже не обтрактные)
class Winter extends Season{
   public String getName() { return "winter";}
    public  boolean isCold() {return true;}
}

class Spring extends Season{
    public String getName() { return "spring";}
    public  boolean isCold() {return false;}
}

class Summer extends Season{
    public String getName() { return "summer";}
    public  boolean isCold() {return false;}
}

class Autumn extends Season{
    public String getName() { return "autumn";}
    public  boolean isCold() {return true;}
}