package ExamplesGoIt;

public class MonobankATM extends Card{


    private int commision = 40;


// метод для снятия лв наслідуемся від острактного отже реалізуєм його метод
    @Override
    public long withDrawMoney(long amountToWithDraw){

        long actualamount = amountToWithDraw+commision;

        if(amountToWithDraw < 0){
            System.out.println("Error");
            return 0;
        }

if(actualamount > ballance){
    System.out.println("Not such money on your card! Try again");
    return 0;
}



        System.out.println("You have amountToWithDrawing " + amountToWithDraw+ "$");
        System.out.println("Plus commission "+ commision+ "$");
        ballance-=actualamount;
return amountToWithDraw;


    }

}
