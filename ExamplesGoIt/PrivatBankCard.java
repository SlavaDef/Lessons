package ExamplesGoIt;

public class PrivatBankCard extends Card{

    private String adress = "Mr_Bhite st 22, Bonos-Airis";


    public String getAdress() {
        return adress;
    }

    // метод для снятия лв наслідуемся від острактного отже реалізуєм його метод
    @Override
    public long withDrawMoney(long amountToWithDraw){
        if(amountToWithDraw < 0){
            System.out.println("Error");
            return 0;
        }

if(amountToWithDraw>ballance){
    System.out.println("Not such money on your card! Try again");
    return 0;
}

ballance-=amountToWithDraw;
        System.out.println("You have amountToWithDrawing " + amountToWithDraw+ "$");
return amountToWithDraw;


    }



}
