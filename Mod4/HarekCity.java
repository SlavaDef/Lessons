package Mod4;

import java.util.Arrays;

public class HarekCity {

    public String[] createEmptyNameArray() {
        String[] result = {};
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        int[] age = {age1, age2, age3, age4};
        return age;
    }

    public void fixNames(String[] names, String[] toReplace) {

        names[1] = toReplace[0];
        names[3] = toReplace[1];

    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String c = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = c;
    }

    public String[] changeElectResultAgain(String[] results) {
        String[] newresalts = {results[2], results[3], results[4]};

        return newresalts;
    }

        /*return new String[] {
                results[2],
                results[3],
                results[4]
        };*/


    public char[][] createKeyboard(){
        return new char[][]   {{'1','2','3'},
                               {'4','5','6'},
                               {'7','8','9'},
                             {'*', '0', '#'}};

    }

    public String[] makeCopy(String[] names){
        System.out.print("Copied!\n");
        String [] copinames = Arrays.copyOf(names,names.length);
        return copinames;

    }

    public void printKeyboard(){
        char[][] o = createKeyboard(); // метод создает новый массив
        for(int i=0;i<o.length;i++) {
            System.out.println(Arrays.toString(o[i]));
        }

    }

    public static void main(String[] args) {
        // int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        //System.out.println(Arrays.toString(ageArray));

       /* String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        new HarekCity().fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));*/

        //String[] names = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        //System.out.println(new HarekCity().firstAndLastTogether(names));

        /* String[] results = new String[]{"miho", "hut"};
        new HarekCity().changeElectResult(results);
        System.out.println(Arrays.toString(results)); */

        /* String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
        String[] changedResults = new HarekCity().changeElectResultAgain(results);
        System.out.println(Arrays.toString(changedResults)); */

        /*char[][] keyboard = new HarekCity().createKeyboard();
        for (int i = 0; i < keyboard.length; i++) {
            System.out.println(Arrays.toString(keyboard[i]));
        }  */

        //new HarekCity().printKeyboard();

        String[] source = new String[] {"Hero", "Mihu","Bob"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));





    }

    }
