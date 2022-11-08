package Mod3;

import java.util.Arrays;
import java.util.Scanner;

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

    public int calculateFuelPrice(String fuel, int count){

        if(fuel.equals("STAR100")){
            return count*70;
        } else if (fuel.equals("STAR500")){
            return count*120;
        }else if (fuel.equals("STAR1000")){
            return count*200;
        }else
            return count*50;

       /* int price = 50;

        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }

        return count * price;
    } */

    }

    public int roundSpeed(int speed){ // округление int по математике
        return (int) Math.round(speed/10.0)*10; // Math.round принимает дабл который округляет по матиматике -
        // 54/10=5.4-> Math.round округлит до 5 -> *10=50 и наоборот

        /*int firstDigit = speed / 10;
        int lastDigit = speed % 10;

        if (lastDigit >= 5) {
            firstDigit++;
        }

        return firstDigit * 10; */
    }

    public int calculateNeededFuel(int distance){

        if (distance<=20){
            return 1000;
        }
        return (distance-20)*5+1000;
    }

    public void calculateMaxPower(){
        Scanner scanner = new Scanner(System.in);
        float firstNumber = scanner.nextFloat();
        float secondNumber = scanner.nextFloat();
        float thirtNumber = scanner.nextFloat();

        float biggestNumber = 0f;

         if(firstNumber > secondNumber & firstNumber > thirtNumber){
             biggestNumber = firstNumber;


         } else if (secondNumber>firstNumber & secondNumber>thirtNumber){
             biggestNumber = secondNumber ;
         } else {
             biggestNumber = thirtNumber;
         }

        if(biggestNumber < 10){
            biggestNumber*=0.7f;
        } else if (biggestNumber >10 & biggestNumber <= 100 )
            biggestNumber*=1.2f;
        else{
            biggestNumber*=2.1f;
        }

         System.out.println(biggestNumber);
        scanner.close();

       /* int max = speed1;
        if (speed2 > max) {
            max = speed2;
        }
        if (speed3 > max) {
            max = speed3;
        }

        float coeff = 0.7f;
        if (max < 10) {
            coeff = 0.7f;
        } else if (max > 10 && max < 100) {
            coeff = 1.2f;
        } else {
            coeff = 2.1f;
        }

        float maxPower = (float) max * coeff;
        System.out.println(maxPower);
        scanner.close(); */
    }
    public String getMyPrizes(int ticket){

          if (ticket % 10 == 0 ){
              if((ticket % 10 == 0  && (ticket>200))){
                  return "crystall coin";
              }
             return "crystall";
}
        else if(ticket % 10 == 7 ){
              if((ticket % 10 == 7 && (ticket>200))){
                  return "chip coin";
              }
              return "chip";
          }
else if (ticket>200){
              return "coin";
          }
else
              return "";

       /* String result = "";
        if (ticket % 10 == 0) {
            result += "crystall";
        }

        if (ticket % 10 == 7) {
            result += " chip";
        }

        if (ticket > 200) {
            result += " coin";
        }

        return result.strip(); */



    }

    public boolean isHangarOk(int side1, int side2, int price){

        int max = side2;
        int min = side1;

        if(side1 > side2){
            max = side1;
            min = side2;
        }
        int square = min*max;

        return ((square >= 1500) && (min * 2 >= max) && (price / square <= 1000));

        }




    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
       // System.out.println(ship.calculateDistance(-10));

        //System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //System.out.println(ship.choosePlanet(45675));

        //System.out.println(ship.calculateFuelPrice("STAR100", 10));

       // System.out.println(ship.roundSpeed(54));

        //System.out.println(ship.calculateNeededFuel(25));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        //ship.calculateMaxPower();
       // System.out.println(ship.getMyPrizes(250));

        System.out.println(ship.isHangarOk(44, 48, 21012000));
    }
}
