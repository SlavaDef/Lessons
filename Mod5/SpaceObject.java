package Mod5;

public abstract class SpaceObject {

}

abstract class Planet extends SpaceObject {

}

class Mars extends Planet{

}

class Moon extends SpaceObject{

}

class PlanetTester{

    String test(SpaceObject object){
       String resalt = "4";


     if( object instanceof  Mars) {
            resalt =  "planet";
        }
        else if (object instanceof  Moon){
            resalt =  "not planet";
        }



return resalt;
    }



    public static void main(String[] args) {
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be "planet"
        System.out.println(tester.test(new Moon())); //Should be "not planet"

    }
}