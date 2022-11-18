package Mod6;

public class BFG {

    private int  ammo;
    private int damage;
   private String name;

   public BFG(int ammo, int damage, String name){
       this.ammo = ammo;
       this.damage = damage;
       this.name = name;
   }

    public BFG(int ammo, int damage){
        this(ammo,damage,"BFG");

    }

    public BFG(int ammo){
        this(ammo,50,"BFG");
    }
    public BFG(){ // важно тут вызоветься констуктор по умолчанию, в него мы передали первый конструктор с тремя
        this(1000,50,"BFG"); // параметрами по умолчанию
    }



    public int getAmmo() {return ammo;}
    public int getDamage() {return damage;}
    public String getName() {return name;}


    @Override
    public String toString() {
        return name + ", ammo: " + ammo + ", damage: " + damage;
    }
}

class BfgTest {
    public static void main(String[] args) {
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG());

    }
}