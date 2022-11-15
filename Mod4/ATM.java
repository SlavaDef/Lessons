package Mod4;

// Напиши клас ATM. У цьому класі створи метод public int countBanknotes(int sum). Він приймає один параметр sum -
// кількість грошей, яку потрібно видати, та повертає мінімальну кількість банкнот, якими можна видати цю суму.

public class ATM {

    public int countBanknotes(int sum){

        int [] bankbots = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int index = 0;

        /* for(int banknot : bankbots){ // для каждой банкноты в масиве банкнот
           count += sum/ banknot; // счетчик равен счетчику + поочередному делению на каждый лемент
           sum = sum % banknot; // остаток от деление на эту же сумму вернет то что не поделилось
} */
        while (index<bankbots.length){
            count += sum / bankbots[index];
            sum = sum % bankbots[index];
            index++;
        }





        return count;
    }

    public static void main(String[] args) {
       int res =  new ATM().countBanknotes(8108);
       System.out.println(res);
    }

}
