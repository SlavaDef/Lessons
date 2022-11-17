package Mod5;

public class LaunchCalculator {


    public int calculateTotalPrice(Spaceport spaceport, int passengerCount) {
        return spaceport.calculateTotalPrice(passengerCount);
    }

    public static void main(String[] args) {
        LaunchCalculator calculator = new LaunchCalculator();

        int jupiterStarPrice = calculator.calculateTotalPrice(new JupiterStar(), 100);
        System.out.println("JupiterStar price = " + jupiterStarPrice); //700

        int mercuryBeatPrice = calculator.calculateTotalPrice(new MercuryBeat(), 100);
        System.out.println("MercuryBeat price = " + mercuryBeatPrice); //1500

        int sunHeavenPrice = calculator.calculateTotalPrice(new SunHeaven(), 100);
        System.out.println("SunHeaven price = " + sunHeavenPrice); //2000
    }
}

abstract class Spaceport {
    public abstract int calculateTotalPrice(int passengerCount);
}

class JupiterStar extends Spaceport {
    public int calculateTotalPrice(int passengerCount) {
        return 500 + (passengerCount * 2);

    }
}
    class MercuryBeat extends Spaceport{
        public  int calculateTotalPrice(int passengerCount){
            return passengerCount * 15;

        }

}

class SunHeaven extends Spaceport{
    public  int calculateTotalPrice(int passengerCount){
        return 2000;

    }

}
