package AlishevLessons;

import java.util.*;


// Вывод -> при возможном добовлении одинаковых обьектов в Set и Map нужно переопределять методы equals() and hashCode()
public class TestHashcode {


    public static void main(String[] args) {

        Map<Person,String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();
        Set<String> sett = new HashSet<>();



         Person person = new Person(1,"Mark");
        Person person2 = new Person(2,"Kate");
        Person person3 = new Person(2,"Kate"); // создали одинаковых человеков

            // добавляем обьеты в Map и Set
        map.put(person," 66age");
        map.put(person2," 25age");
        map.put(person3," 25age");

        set.add(person);
        set.add(person2);
        set.add(person3);

        System.out.println(map);
        System.out.println(set);
    }
}

class Person{
    private int id;
    private String name;

    Person(int id,String name){ // конструкт
       this.id = id;
       this.name = name;
    }

    public String toString(){ // переопределяем метод toString() для вывода данных
        return "Person with id - " + id + " say that his name is "+ name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}

/* Вывод, Map и Set допустил повторение, такого не должно быть посему нужно переопределить методы hashCode() и equals()

{Person with id - 2 say that his name is Kate= 25age, Person with id - 2 say that his name is Kate= 25age, Person with id - 1 say that his name is Mark= 66age}
[Person with id - 2 say that his name is Kate, Person with id - 2 say that his name is Kate, Person with id - 1 say that his name is Mark]

После переопределения методов hashCode() и equals() все работает верно -> generate -> equals() and hashCode()
{Person with id - 2 say that his name is Kate= 25age, Person with id - 1 say that his name is Mark= 66age}
[Person with id - 2 say that his name is Kate, Person with id - 1 say that his name is Mark]



 */