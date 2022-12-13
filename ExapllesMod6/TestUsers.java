package ExapllesMod6;

public class TestUsers {

    public static void main(String[] args) {

       // User user1 = new User();
        User user2 = new User("Bob", "Adams", " Bob@gmail.com", "088 444 77 88");

        //System.out.println(user1);
        System.out.println(user2);


        UserEntity us = new UserEntity(user2);
        System.out.println(us);
    }
}
