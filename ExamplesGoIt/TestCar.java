package ExamplesGoIt;

public class TestCar {

    public static void main(String[] args) {
        // у интерфейсов нет конструкторов Сar car = new Car() - так не выйдет


        Car car = new Volvo();
        car.drive();
        car.getNumberOfWheels();
        car.horsePower();
    }


}



