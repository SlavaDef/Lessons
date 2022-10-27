package AlishevLessons;

import java.util.Objects;

public class Persons {

    private int id;
    private String name;

    Persons(int id,String name){ // конструкт
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
        Persons person = (Persons) o;
        return id == person.id && Objects.equals(name, person.name);
    }
// по умолчанию для проверки равенства вызоветься метод hashCode(), но он не всегда может быть верен, но более
// быстрый чем equals()
// {Object} -> {int}
    @Override
    public int hashCode() { // должна быть быстрой и гарантировать мин кол-во колизий
        return Objects.hash(id, name);
    }

    /* Контракт (взаимосвязь)  hashCode() и equals() следующий
1. У двух проверяемых обьектов вызываем метод hashCode()
если хеши разные возврат false два обьекта разные

2. если хеши одинаковые то -  колизия(совпадение) или же обьекты одинаковые для перепроверки вызываем метод equals()

3. и уже equals() нам выдает точный ответ

     */

}
