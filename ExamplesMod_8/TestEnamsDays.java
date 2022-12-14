package ExamplesMod_8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

public class TestEnamsDays {


    public static void main(String[] args) {
        DaysOfWeeks days = DaysOfWeeks.FREDAY; // обращение как к константе через точку
        workDayOrNot(days); // ссылку передали в метод кейс вернул кейс для этого дня
        workDayOrNot(DaysOfWeeks.SATURDAY);// без ссылки на прямую передали в метод

        // values() вернет все наши перечесления нужно положить в массив
        final DaysOfWeeks [] day = DaysOfWeeks.values();
        System.out.println(Arrays.toString(day));

        // просто получить значение какогото из енама
        final DaysOfWeeks friday = DaysOfWeeks.valueOf("MONDAY");
        System.out.println(friday);

        final String name = friday.name(); // return в виде String

        final String trans = friday.getTranslate(); // гетером повернули переклад із конструктора
        System.out.println(name+ " = " + trans);

        final int numb = friday.getNumberOfDay(); // гетером вернули числовое представление енама
        System.out.println("The number of " + name + " is " + numb);



        System.out.println(days.whotDay()); // вызов метода whotDay() с енама

        DaysOfWeeks day2 = DaysOfWeeks.SANDAY; // обращение как к константе через точку

        String g = day2.whotDay(); // вызов метода запихнули в переменную

        System.out.println(g); // вывели
        day2.printi();
                                                           // !!!!!!
        EnumSet<DaysOfWeeks> setEnum = EnumSet.allOf(DaysOfWeeks.class); // создали множиство и засунули туда все енами
System.out.println(setEnum); // вывели нашу колекцию Енамов

// Map - DaysOfWeeks ключ, List<String> -  значения    + DaysOfWeeks.class указываем какой клас используем
        EnumMap < DaysOfWeeks, List<String> > dayPlans = new EnumMap<>(DaysOfWeeks.class);

// dayPlans планы на день

// ложим в словарь планы на определенный день (планы листом)
        dayPlans.put(DaysOfWeeks.MONDAY,Arrays.asList("Go to hospital", "Take a shower", "Go to shop"));
        dayPlans.put(DaysOfWeeks.SANDAY,Arrays.asList("Go to the garadge", "Take a shower", "Stolen new car."));

        System.out.println(dayPlans); // увидем планы на два дня

    }




    private static void workDayOrNot(DaysOfWeeks day){

        switch (day){
            case SANDAY, SATURDAY:
                System.out.println("Today is free day");
            break;

            case MONDAY, TUESDAY, WEDNERSDAY, THURSDAY, FREDAY:
                System.out.println("Today is working");
            break;

            default:
                System.out.println("No such day in the week");
        }

    }
}
