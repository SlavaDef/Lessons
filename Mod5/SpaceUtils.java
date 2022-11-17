package Mod5;

public class SpaceUtils {

    public static final int PLANET_COUNT = 8;
    public static final String  HOME_PLANET_NAME  = "Earth";
    public static final String HOME_STAR_NAME   = "Sun";


    public  static String pluralPlanets(int planetCount){

        if (planetCount==1){
            return "1 planet";
        } else if(planetCount>1){
            return planetCount+ "planets";
        }
return "";
    }

    public  static String generateStartMessage(String shipName, String time){

        return "Ship " + shipName + " start at " + time;
    }

}
