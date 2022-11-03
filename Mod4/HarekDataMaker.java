package Mod4;

public class HarekDataMaker {


    public String aggregateSingle(String name, String age, String planet){

return "name - " + name +", age - " + age+", planet - " + planet;

    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets){

        

    }


    public static void main(String[] args) {
System.out.println(new HarekDataMaker().aggregateSingle("bob","55","Mars"));
    }
}
