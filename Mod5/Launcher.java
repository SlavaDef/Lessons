package Mod5;

public class Launcher {

    public static void main(String[] args) {
        Spaceport2 spaceport = new Spaceport2();
        spaceport.launch();
    }
}

class Spaceport2 {
    // создали в классе обьекты другого класса

    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();

    private Radar radar = new Radar();

    private CommandPost commandPost = new CommandPost();


    public void launch() { // в этом методе вызвали методы классов
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
        radar.scan();
        commandPost.command();
    }
}

class GasStation{
    public void refuel(){
        System.out.print("Refuel done!");
    }
}

class ServiceTower{

    public void service(){
        System.out.print("Service done!");
    }
}

class CompressorStation{
    public void compress(){
        System.out.print("Compress done!");
    }
}

class Radar {
    public void scan(){
        System.out.print("Scan done!");
    }
}

class CommandPost{
    public void command(){System.out.print("Fire!");}
}

/*
1. Опиши клас GasStation. У цьому класі напиши метод public void refuel(). Цей метод повинен виводити
у консоль текст "Refuel done!".

Додай до класу Spaceport приватне поле типу GasStation, назви його gasStation.
Відразу проініціалізуй це поле (використовуй вираз new GasStation()).

Додай у метод launch() класу Spaceport виклик методу refuel() поля gasStation.
 */