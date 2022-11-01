package Mod4;

import java.util.Arrays;

public class HarekCity {

    public String[] createEmptyNameArray() {
        String[] result = {};
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4){
        int[] age = {age1,age2,age3,age4};
        return age;
    }

    public void fixNames(String[] names, String[] toReplace){
        // names = new String[5];
       // toReplace = new String[2];
        // names= {names[0],toReplace[0],names[2],toReplace[1],names[4]};
        //names = Arrays.copyOf(mas,mas.length);



    }

    public static void main(String[] args) {
       // int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        //System.out.println(Arrays.toString(ageArray));

        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        new HarekCity().fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));

    }


}
