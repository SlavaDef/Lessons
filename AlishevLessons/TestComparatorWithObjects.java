package AlishevLessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparatorWithObjects {


    public static void main(String[] args) {

        List<Man> mans = new ArrayList<>();

        mans.add(new Man(22,"Bob"));
        mans.add(new Man(32,"Linda"));
        mans.add(new Man(42,"Galia"));
        mans.add(new Man(12,"Ann"));
        mans.add(new Man(5,"Tom"));

        Collections.sort(mans, new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {  // анонимус клас сравнение обьектов по возрасту
                return o1.getAge()-o2.getAge(); // вызов метода на первом обьекте - вызов на втором
            }
        });

        System.out.println(mans);

       /* Collections.sort(mans, new Comparator<Man>() {
            @Override
            public String compare(Man o1, Man o2) {
                if( o1.getName().length()>o2.getName().length()){
                    return ""+1;
                }
                else if(o1.getName().length()<o2.getName().length()){
                    return ""+-1;
                } else {
                    return ""+0;
                }
            }
        });
*/

    }


}

class Man{

    private int age;
    private String name;

    Man(int age,String name){
        this.age = age;
        this.name = name;


    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Man with name "+ name+" and his age is  " + age;

    }


}