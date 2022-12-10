package ExamplesGoIt;

// Card обстракт класс, шаблон

public abstract class Card {

    protected long ballance = 2500; // protected щоб наше поле могли бачити нащадки

    private String cardName = "Gold";

    private String surName = "Slava F.";

    private long creditLimit = 200000;


    public String getCardName() {return cardName;}

    public String getSurName() {return surName;}

    public long getBallance() {return  ballance;}

    public long getCreditLimit() {return  creditLimit;}

    public void setCreditLimit(long creditLimit) {this.creditLimit=creditLimit;}


// наслідники повинні будуть реалізувати абстракні методи
    public abstract long withDrawMoney(long amountToWithDraw);

}



class TestCard {

    public static void main(String[] args) {

          // Card card = new PrivatBankCard();

        /* System.out.println("Card name is " + card.getCardName()); // гетер поверне імя
        System.out.println("Cards owner is  " + card.getSurName());// гетер поверне власника
        System.out.println("Slava F, your ballance is  " + card.getBallance()); // поверне баланс
        System.out.println("Your credit limit is " + card.getCreditLimit()); // поверне кредит лимит
        System.out.println("=============================");

        card.withDrawMoney(5777); // зняли сумму
        card.setCreditLimit(150000); // сетер встановили значення ліміту

         System.out.println("Slava F, your ballance is  " + card.getBallance());
        System.out.println("Your credit limit is " + card.getCreditLimit());
        card.withDrawMoney(56775777);// зняли сумму більше балансу - не вийде
        System.out.println("Slava F, your ballance is  " + card.getBallance());
        System.out.println("============================="); */

        PrivatBankCard testcard = new PrivatBankCard(); // Card card = new PrivatBankCard();

        System.out.println("Slava F, your ballance is  " + testcard.getBallance());
        System.out.println("Whot is adress? " + testcard.getAdress());
        System.out.println("Card name is "+ testcard.getCardName());
        System.out.println("Limit is "+ testcard.getCreditLimit());

        ATMPrivatBank atm = new ATMPrivatBank(); // обьект класса где есть метод

        atm.withDrawMoney(testcard,500);// в параметры метод принимает ссылку на обьект и сумму на снятие

        System.out.println("Slava F, your ballance is  " + testcard.getBallance());
        System.out.println("=============================");

         MonobankATM mono = new MonobankATM(); // или так  Card card = new MonobankATM();
        System.out.println("Slava F, your ballance is  " + mono.getBallance());

        atm.withDrawMoney(mono,800);
        System.out.println("Slava F, your ballance is  " + mono.getBallance());

    }

}
