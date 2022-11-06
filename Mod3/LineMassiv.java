package Mod3;

public class LineMassiv {

    public static void main(String[] args) {

        int [] arr = new int[] {34,-2,8,12,-12,-56,99,54,33,77,-9,8,8,69};

        int res = new  LineMassiv().lineSearch(arr,68);
        System.out.println(res);




       /*int counter = 0;
        int searsh = 99;
        int newNumb = -1;

        // линейный поиск каждый элемент в массиве сравниваеться с заданной переменной

        for (int i = 0; i<arr.length; i++) {  // прошлись по всем числам в массиве
            counter++; // считаем каждый проход цикла по элементу
            if (arr[i] == searsh) { // если число с индексом равно искуемому числу
                newNumb = arr[i]; // newNumb получит его значение или вернет -1, если такового нет
                break; // выходим из цикла далее искать не надо

            }

            }
        System.out.println(" Counter = " + counter);
        System.out.println(" newNumb = " + newNumb);
        System.out.println(" arr.length = " + arr.length );
*/

    }







    public int lineSearch(int[] mas,int found){
        int foundNumber=-1;


        for (int i = 0; i<mas.length; i++) {

            if (mas[i] == found) {
                foundNumber=mas[i];
            }
        }
             return foundNumber;
    }


}
