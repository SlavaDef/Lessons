package Mod6;

public class AIPlayer {

    private int hp;

    public void setHp(int hp) throws IllegalArgumentException {


        this.hp = hp;
        if (hp < 0 | hp>100) {
            throw new IllegalArgumentException();

        }


    }
}

class AIPlayerTest {
    public static void main(String[] args) {
        AIPlayer player = new AIPlayer();

        //Ok value
        try {
            player.setHp(500);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        //Invalid value
        try {
            player.setHp(1);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }
    }
}
