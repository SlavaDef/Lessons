package Mod6;

public class Hero {

    private String name;
    private int hp;


    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        if(this.hp<0){
            this.hp=0;
        }if(this.hp>=200){
            this.hp=200;
        }

    }

    public Hero() {
        this("Paratrooper", 100);


    }



    public String getName() {
        return name;
    }

    public int getHp() {


        return hp;

    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero("Stranger", 500);
        System.out.println(hero.getHp());

        //Expect Stranger
       // System.out.println(hero.getName());

        //Expect 50
        //System.out.println(hero.getHp());

        // new Hero("Stranger", 250).getHp();
        //new Hero().getHp();
    }
}
