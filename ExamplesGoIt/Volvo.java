package ExamplesGoIt;

public class Volvo implements Car{

    // обязательно нужно переопределить методы

    @Override
    public void drive() {
        System.out.println("Seiv driving!");

    }

    @Override
    public int horsePower() { // в этом методе могут быть какиэто вычесления обьем двигателя, расчет кон сил...
        return 300;
    }




}
