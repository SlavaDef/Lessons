package AlishevLessons;

import java.util.*;

public class TestComparable {


    public static void main(String[] args) {
        List<WomanRobot> robotList = new ArrayList<>();
        Set<WomanRobot> setList = new TreeSet<>(); //TreeSet множество хранящее порядок + обьекты сразу отсортированны

        addRobots(robotList); // что  List что Set являються колекциями и реализуют интерфейс Collection(прародитель)
        addRobots(setList);

        Collections.sort(robotList);

        System.out.println(robotList);
        System.out.println(setList);
    }
    // метод принимает на вход колекции, любые, верхний над всеми интерфейсами колекций
  private  static  void addRobots(Collection collection){

      // добавим 4 обьекта типа WomanRobot

      collection.add(new WomanRobot(5,"Sonia"));
      collection.add(new WomanRobot(4,"Ann"));
      collection.add(new WomanRobot(2,"Mira"));
      collection.add(new WomanRobot(14,"Gabriella"));
  }

}



class WomanRobot implements Comparable<WomanRobot> {

    private int age;
    private String name;


    WomanRobot(int age, String name){
        this.age = age;
        this.name = name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WomanRobot that = (WomanRobot) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public  String toString(){

      return "Your name is " + name + ", your age is " + age;

}

    /* реализуя интерфейс мы указываем на то что теперь есть какой то порядок для будущих сортировок
    логику порядка описываем в этом методе в отличии от Компоратора тут сравниваеться один обьект с каким то другим */
   /* @Override
    public int compareTo(WomanRobot anotherAge) { // сорировка по  году от меньшего к большему
        if(this.age>anotherAge.age){
            return 1;
        }else if(this.age<anotherAge.age){
            return -1;
        }else {
            return 0;
        }
    }
    @Override
    public int compareTo(WomanRobot anotherName) {
        if(this.name.length()>anotherName.name.length()){ // сорировка по длинне имени от меньшего к большему
            return 1;
        }else if(this.name.length()<anotherName.name.length()){
            return -1;
        }else {
            return 0;
        }
    }
*/
    @Override
    public int compareTo(WomanRobot anotherAge) {
      return this.age-anotherAge.age; // более простой способ для int
    }

 /*   @Override
    public int compareTo(WomanRobot anotherName) {

        return this.name.length()-anotherAge.name.length(); // более простой способ для String
    }*/
}