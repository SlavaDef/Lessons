import java.util.Scanner;

public class PassportFormCreator {

    public void createForms(){

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = scanner.nextInt();

        System.out.print(name+" "+ surname+" "+age*10);
        System.out.println();
        System.out.println(name.toUpperCase());
        System.out.println(surname.toUpperCase());
        System.out.println(age*10);

        scanner.close();
    }

    public static void main(String[] args) {
          new PassportFormCreator().createForms();
    }
}
