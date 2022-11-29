package Mod7;

class GooQuery {

    private final  String language;
    private  final String  text;

    public GooQuery(String language,String  text){
        this.language = language;
        this.text = text;
    }
public String getLanguage(){
        return language;
}

public String getText(){
        return text;
}
@Override
public String toString(){
        return "Searching [" + text+ "], using language: " + language;
}


}


class GooQueryTest {
    public static void main(String[] args) {
        GooQuery query = new GooQuery("en", "capital");

        //en
        System.out.println(query.getLanguage());

        //capital
        System.out.println(query.getText());

        //Searching [capital], using language: en
        System.out.println(query);
    }
}
