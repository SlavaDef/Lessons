package Mod6;

class Level {
    private LevelInfo levelInfo;

    private Point[] points;



    public Level(LevelInfo levelInfo, Point[] points){
          this.levelInfo = levelInfo;
          this.points = points;

 }

    @Override
    public String toString() { // обьект в конструкторе на ссылке обьекта вызываем метод вложеного класса
        return "Quarke level, name is " + levelInfo.getName() +", difficulty is " + levelInfo.getDifficulty() + ", point count is " + points.length;
    }

   public int calculateLevelHash(){

        int res = 0;
for (int i = 0; i< points.length; i++){
    res += points[i].getX()*points[i].getY(); // на каждой точке выззываем с внутреннего класса метод
}
return res;


    }

    static class Point{

       private int x,y;


       public int getX(){
           return x;
       }

        public int getY(){
            return y;
        }

        public Point(int x, int y){
           this.x = x;
           this.y = y;

        }
    }

    static class LevelInfo{
        private String name;
        private String difficulty;

public String getName(){
    return  name;
}
public String getDifficulty(){
    return difficulty;
}

public LevelInfo(String name, String difficulty){
    this.name = name;
    this.difficulty = difficulty;
}


    }
}
class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        //3015
        System.out.println(new Level(info, points).calculateLevelHash());
    }
}