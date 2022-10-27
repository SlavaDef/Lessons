package AlishevLessons;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestHashMap22 {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("Bob",22);
        map.put("Tom",28);
        map.put("Jo",32);

        Set<String> set = new HashSet<>(); // HashSet реализует как бы HashMap он более ограничен
    }
}
/*
HashMap  в своей реализации использует массив(связных списков) Node<K,V>[] table; -> K -> Key, V-> value
в каждом узле есть hash(номер ячейки) -> K -> Key, V-> value + ссылка на след узел
при добавлении Map<String,Integer> со String получаем hashCode но число большое идет побитовое умножение на длинну -1
map.put("Bob",22); -> hash("Bob") =298464 -> index = hash & (n-1) где n длинна массива - получаем номер ячейки, скажем 4


 */