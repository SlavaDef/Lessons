package Mod4;

public class TestForWithReturn {

    public boolean isArrayContainsValue(String[] names, String searchName) {
        for(String name: names) {
            if (name.equals(searchName)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String [] name = {"Dj","Snow", "Cail","Ivan"};
        new TestForWithReturn().isArrayContainsValue(name,"Cail");


    }
}

/*У прикладі вище ми пробігаємося по масиву рядків, і порівнюємо кожне значення з searchName,
яке ми шукаємо. Коли знаходимо потрібне – відразу повертаємо true. Якщо ж ми дійшли до кінця масиву,
і не знайшли потрібне нам значення - ми доходимо до кінця методу, і повертаємо false.
 */
