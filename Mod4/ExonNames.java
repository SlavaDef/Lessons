package Mod4;

public class ExonNames {
    public boolean areNamesEqual(String name1, String name2){
              return name1.equals(name2);

    }

    public String makeFullName(String firstName, String lastName){

        return firstName.toLowerCase() + " " +lastName.toUpperCase();
    }

    public boolean isNameLucky(String name){
        return name.contains("a") | name.contains("o");

    }

    public String getNameCode(String name){
        String lowerCaseName = name.toUpperCase();

        if (lowerCaseName.length()==1){
            char t = lowerCaseName.charAt(0);
            return (String) ""+t;
        }
           char c = lowerCaseName.charAt(0);
           char b = lowerCaseName.charAt(lowerCaseName .length()-1);

        return (String) (c +""+b);

    }

    public boolean isMoneyName(String name){
         char v = name.charAt(0);
         char s = name.charAt(name.length()-1);
         if((v >='0'&& v<='9')&&(s >='0'&& s<='9')){
             return true;
         }

return false;
    }

    public static void main(String[] args) {
        ExonNames names = new ExonNames();


       // boolean namesEqual = names.areNamesEqual("Nm", "nm");
       // System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        //String fullName = names.makeFullName("exor", "bigo");
        //System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        //boolean isNameLucky = names.isNameLucky("Big");
        //System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

       // String nameCode = names.getNameCode("S");
       // System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        boolean isMoneyName = names.isMoneyName("31Boss");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);
    }

}
