package ExamplesGoIt;

public class ATMPrivatBank {

    // в зажежності від того обьект якого классу ми передамо у метод буде викликатися метод того классу

public void withDrawMoney(Card card, long money){ // метод приймае банкомат (картку) і гроші
card.withDrawMoney(money); // визвали на обьекті метод з классу Card який знімає кошти
}





}
