package ExapllesMod6;

import java.util.Arrays;

public class AdminUser extends User {

    private String [] privs;
//    public AdminUser() {
//        System.out.println("AdminUser constructor");
//    }

    public AdminUser(String firstName, String lastName, String mail, String phoneNumber, String[] privs) {
        super(firstName, lastName, mail, phoneNumber); // вызов конструктора родителя
        this.privs = privs;
        System.out.println("AdminUser params constructor");
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "privs=" + Arrays.toString(privs) +
                ", firstName='" + getName() + '\'' +
                ", lastName='" + getSurName() + '\'' +
                ", mail='" + getMail() + '\'' +
                ", phoneNumber='" + getPhone()+ '\'' +
                '}';
    }

}



