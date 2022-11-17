package Mod3;

import java.util.Scanner;

public class PassportFormCreator {

    public void createForms(){

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.next();
        int age = scanner.nextInt();

    System.out.print(name + " " + surname + " " + age*10 + "\n");
    System.out.print(name.toUpperCase()+"\n"+surname.toUpperCase()+"\n"+age*10);


    scanner.close();
    }

    public static void main(String[] args) {

        new PassportFormCreator().createForms();
    }
}
