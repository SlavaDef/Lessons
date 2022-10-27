package AlishevLessons;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {
        // Map - интерфейс, HashMap() ссылаеться на него
        // при создании указываеться тип ключа и тип значения, пары ключ значений <Integer,String> в нашем примере
        // это номер класса и школьники... число и его перевод (словарь в пайтон)
        // класс HashMap не гарантирует порядка, используем тогда когда не важен порядок ключ значений важно - наличие
        Map<Integer,String> map = new HashMap<>();

        map.put(1, "one"); // принимает два аргумента первый ключ второе значение которое ему соотвецтвует
        map.put(2, "two"); // в этом примере ключ цифра , значение ее перевод
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        System.out.println(map);

        // у Map не может быть два дубликата ключей, (два одинаковый ключа)
        map.put(3, "another three"); // присвоив ключу новое значение оно перезаписываеться
        System.out.println(map);

        System.out.println(map.get(1)); //  metod get(); return значение по ключу
        System.out.println(map.get(10)); // return "null" because there is no such key

//  в в Java пара ключ значение расматриваються как одно целое - Entry
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            // map.entrySet() метод вернет набор всех пар ключ значений в нашем Map(вернет все обьекты с нашего Map
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }

              for (int i=1; i<6;i++){ // вывод всех значений, length нет кол во нужно знать
                  System.out.println(i +" = "+ map.get(i));
                  //System.out.println(map.entrySet());

}
    }
}
