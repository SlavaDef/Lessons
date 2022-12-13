package ExapllesMod6;

public class User {

    //User(){

   // }

    private final String name;
    private final String surName;
    private final String mail;
    private final String phone;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    private int id;



    User(String name, String surName, String mail, String phone){
        this.name = name;
        this.surName = surName;
        this.mail = mail;
        this.phone = phone;
        System.out.println("User Constructor");
    }


    @Override
    public String toString() {
        return "Username is " + name + '\'' +
                ", surName is " + surName + '\'' +
                ", mail is " + mail + '\'' +
                ", phone number is " + phone + '\'' +
                ", id = " + id +
                '}';
    }

}


