package Mod7;

public class SummaryCreator {

    public String create(String text){

StringBuffer st = new StringBuffer(text); // обьект StringBuffer в параметры текст

        if(text.length()<=15){
            return text;
        }
       else if(text.length()>15  ){ // если длинна текста больше 15
            st.delete(15,text.length()); // удалим все от 15 символа до конца
           if(!Character.isWhitespace(text.charAt(15))){ // если 16 символ не пробел

              st.append("..."); // добавляем ...
           }

        }


       return st.toString(); // toString() вывод текста в буквенной интерпретации
    }
}

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}
