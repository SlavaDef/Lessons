package Mod4;

// 1. Напиши метод public String drawQuad(int n), який малює символами '*' квадрат зі стороною n.
// 2. Напиши метод public String drawRect(int width, int height, char c), який намалює символом c прямокутник,
// у якого height рядків, кожен рядок має width символів.
// 3. Напиши метод public String drawLine(int length). Він малює лінію завдовжки length символами '*' та '#' почергово,
// починаючи з символу '*' і повертає цю лінію.
// 4. Напиши метод public String drawPattern(char[] pattern, int repeatCount), який приймає зразок для малювання
//   - pattern, і кількість разів, які потрібно поспіль намалювати цей зразок repeatCount.
//   Метод повертає рядок з намальованим, вказану кількість разів, зразком.


public class ArlanHelper {

    public String drawQuad(int n){
String mir = "*";
int line = 0;
int x = 0;
    while(line<n){
        while(x<n) {
            System.out.print(mir);
            x++;
        }
        x=0; // важное поле, иначе когда x=n , мы в этот цикл больше не войдем
        System.out.println();
        line++;
    }

        return "";
    }

    public String drawRect(int width, int height, char c){
        int x = width;

while(height>0){
    while (x>0){
        System.out.print(c);
        x--;
    }
    x = width;
    System.out.println();
    height--;
}
        return "";

  /*      String result = "";

        int lines = height;

        while(lines > 0) {
            lines--;

            int columns = width;
            while(columns > 0) {
                result += c;
                columns--;
            }

            result += "\n";
        }

        return result;
*/
    }
    public String drawLine(int length){
int x = 0;
String line = "";
        while(x<length) {
            if (x % 2 == 0) {
                line += "*";

            }
            if (x % 2 == 1) {
                line += "#";

            }
            x++;
        }
return line;

        /*
         String result = "";

        boolean star = true;

        while (length > 0) {
            result += star ? '*' : '#';
            star = !star;
            length--;
        }

        return result; */

    }

    public String drawPattern(char[] pattern, int repeatCount){
int i = 0;
        String word = "";
        while (repeatCount>0){

            while(i<pattern.length){
                word += pattern[i];
                i++;
            }
            i=0;
            repeatCount--;
        }
        return word ;

    }


    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();

       // System.out.println(helper.drawQuad(3));

       // System.out.println(helper.drawRect(2, 3, 'X'));
        // System.out.println(helper.drawLine(6));

        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));

    }


}
