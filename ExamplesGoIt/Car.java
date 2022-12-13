package ExamplesGoIt;

public interface Car {

    static final int NUMBER_OF_WHEELS = 4; // в интерфейсах могут быть константы

    // в интерфейсе все методы публичные public можно не писать

    void drive(); // по сути абстрактный метод, реализацию нужно будет уже писать в классах имплементирующих

    int horsePower();

    default int getNumberOfWheels(){ // могут быть дефолт методы которіе не нужно специально реализовівать в классах имплементаторах
       return NUMBER_OF_WHEELS;
    }
}
