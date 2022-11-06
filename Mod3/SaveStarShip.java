package Mod3;

import java.util.Arrays;

public class SaveStarShip {

    public int calculateDistance(int distance){
        if (distance>0){
            return distance;
        }

       return -distance;
    }

    public String[] getPlanets(String galaxy){
        String[] none = {};
         String[] miaru = {"Maux", "Reux", "Piax"};
        String[] milkyway = {"Earth", "Mars", "Jupiter"};
        String[] dangerBanger = {"Fobius", "Demius"};

               if(galaxy.equals("Miaru"))  {
                   return miaru;
               } if(galaxy.equals("Milkyway"))  {
            return milkyway;
        }      if(galaxy.equals("DangerBanger"))  {
            return dangerBanger;
        }


        return none;

        /*if (galaxy.equals("Miaru")) {
            return new String[] {"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[] {"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[] {"Fobius", "Demius"};
        } else {
            return new String[0];
        }*/
    }

    public String choosePlanet(long distanceToEarth){
        if (distanceToEarth<45677){
            return "Earth";
        } else
            return "Pern";
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        System.out.println(ship.choosePlanet(45675));
    }
}
