package ExamplesGoIt;

// задача разделить емаил на сам емаил и инт(напоминание через сколько дней нужно обновить пароль

public class Emails {

public static  void sendEmail(String email,String expDay){
    System.out.println("to" + email);
    System.out.println("Your password expires in " + expDay + " days. Renew please.");
    System.out.println("------------------------------------");
}


    public static void main(String[] args) {

        String[] emails = {"Bob@gmail.com,22",
                "Job@gmail.com,5",
                "MoPs12@gmail.com,62",
                "Bred2345@gmail.com,5",
                "Hops@gmail.com,32"};


        for (int i = 0; i < emails.length; i++) { // прохоd по масиву емейлов
            String emal = emails[i]; //  переменной emal присваиваеться поочередно каждый элемент из масива
            String [] strings = emal.split(",");// метод split() разбивает до запятой и делает массив с двух строк
            int expDay = Integer.parseInt(strings[1]); // из второй строчки делаем инт
            if(expDay <= 50){ // инт меньше 50 - посылаем уведомление
                sendEmail(strings[0],strings[1]); //  вызов метода с параметрами из разбиой строки
            }

        }

        /*
        toBob@gmail.com
Your password expires in 22 days. Renew please.
------------------------------------
toJob@gmail.com
Your password expires in 5 days. Renew please.
------------------------------------
toBred2345@gmail.com
Your password expires in 5 days. Renew please.
------------------------------------
toHops@gmail.com
Your password expires in 32 days. Renew please.
------------------------------------


         */
    }
}
