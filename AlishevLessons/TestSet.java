package AlishevLessons;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {


        //Set хранит уникальные значения, обьекты

        // HashSet<>() не хранит порядок
        Set<String> hashSet = new HashSet<>();

        //LinkedHashSet<>() - сохраняеться порядок ввода элементов
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // TreeSet<>() - обьекты сортируються по порядку (числа от меньшего к большему, строки от а до я)
        // a < b, b < c....  a == 0, b == 1 .... лексикографический порядок
        // aa < ab....
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Toma"); // hashSet.add("Toma") // linkedHashSet.add("Toma")...
        treeSet.add("Kate"); // hashSet.add("Kate") // linkedHashSet.add("Kate")...
        treeSet.add("Andre"); //
        treeSet.add("Givi");  //
        treeSet.add("Zak"); //

        for(String name : treeSet){ // hashSet // linkedHashSet
            System.out.println(name);
        }

        // metods in Set:

        System.out.println(treeSet.contains("Zak")); // contains return true or false

// the most usless is hashSet, becouse of quick(fast)

        hashSet.add("Andre");
        hashSet.add("Givi");
        hashSet.add("Zak");

        System.out.println(hashSet.contains("Zik"));
        System.out.println(hashSet.isEmpty()); // isEmpty() return -> true if our Set is empty or false if not empty
        System.out.println(hashSet); // просто вывод содержимого Сета
    }
}
