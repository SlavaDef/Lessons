package Mod5;

public class Stars {

    private int count;

    public int getCount(){
        return  count;
    }

    public  void setCount( int count){
        this.count = count;
    }

    @Override
    public String toString(){

        String result = "";

      while (count>0){
          if(count>=1000) {
              count -= 1000;
              result+="X";
          }
          else if(count<1000 & count>=100){
              count -= 100;
              result+="Y";
          } else if (count<100 & count>=10){
              count-= 10;
              result+="Z";
          } else if(count<10) {
              count -= 1;
              result += "*";
          }

      }


        return  result;
    }




    public static void main(String[] args) {


        Stars stars = new Stars();
        stars.setCount(576);
        System.out.println(stars);
        System.out.println(stars.getCount());

    }
}
 /*
 Напиши клас Stars. У цьому класі оголоси поле count типу int - кількість зірок.
Перевизнач у класі Stars метод toString(). Він повинен повертати кількість зірок у прийнятому у
Міжгалактичній Гільдії Космоходців форматі.

 1000 зірок записуються символом X;
 100 зірок записуються символом Y;
 10 зірок записуються символом Z;
 1 зірка записується символом *.
  */