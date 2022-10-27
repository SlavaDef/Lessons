package AlishevLessons;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestLinkedAndTreeMap {

    // LinkedHashMap - сохраняет добавление в словарь
    // TreeMap - сортирует пары ключ значение по ключу

    public static void main(String[] args) {
        // создаем три обьекта и ссылаем их на интерфейс Map

          // внутри не гарантируеться порядок
        Map<Integer,String> hashMap = new HashMap<>();

        //  гарантируеться порядок добавление пар ключ значения
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();

        //  гарантирует что пары ключ значений будут отсортированы по ключу
        Map<Integer,String> treeMap = new TreeMap<>();

        //testMap(hashMap); // вызвали метод на обьекте HashMap
        //testMap(linkedHashMap); // вызвали метод на обьекте LinkedHashMap
        testMap(treeMap); // вызвали метод на обьекте TreeMap
    }
    // метод для тестирования, на вход метод принимает любой Map с ключом Integer и значением типа  String
    public static void testMap(Map<Integer,String> map){
              map.put(35,"Bob");
              map.put(30,"Tom");
              map.put(44,"Jon");  // ключей не может быть одинаковых но значения могут
              map.put(15,"Ann");
              map.put(20,"Sidi");
              map.put(64,"Kati");
              map.put(0,"Jofri");
              map.put(1500,"Timi");

              for(Map.Entry<Integer,String> entry : map.entrySet()){
                  System.out.println(entry.getKey()+" : "+ entry.getValue());
              }
    }

}
