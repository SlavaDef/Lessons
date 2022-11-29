package Mod6;

public class LevelLoader {

    private LevelLoader(){

    }

    String load(String levelName){
        return "Loading level" + levelName;
    }

    private static LevelLoader instance = new LevelLoader();

    public static LevelLoader getInstance(){
        return instance;
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
    }
}