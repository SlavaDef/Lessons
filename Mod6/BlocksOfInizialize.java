package Mod6;

public class BlocksOfInizialize {

   static  { // данный блок выполниться первым до конструктора при создании обьекта
        System.out.println("Static - first block in my  code!");
    }

    {
        System.out.println("Thirt block in my  code!");
    }

    {
        System.out.println("Four block in my  code!");
    }
    BlocksOfInizialize(){
        System.out.println("Hello from the constryctor of the parents block");
    }

}

class Blocks extends BlocksOfInizialize{

    static  { // данный блок выполниться вторым до конструктора при создании обьекта тут клас наследник
        System.out.println("Static - second block in my  code!");
    }

    {
        System.out.println("Five block in my  code!");
    }

    {
        System.out.println("Six block in my  code!");
    }

    Blocks(){
        System.out.println("Hello from the constryctor of the Blocks block");
    }
}

class TestBlocks{
    public static void main(String[] args) {
        new Blocks();
        System.out.println();
        new Blocks();
    }
}
/*
Static - first block in my  code!
Static - second block in my  code!
Thirt block in my  code!
Four block in my  code!
Hello from the constryctor of the parents block
Five block in my  code!
Six block in my  code!
Hello from the constryctor of the Blocks block

Thirt block in my  code!
Four block in my  code!
Hello from the constryctor of the parents block
Five block in my  code!
Six block in my  code!
Hello from the constryctor of the Blocks block

Якщо є блоки ініціалізації (звичайні та статичні), конструктори, то вони виконуються в наступному порядку:

1. виконуються всі статичні блоки ініціалізації (спочатку батьківських класів, якщо клас наслідується від
іншого класу);
2. виконуються звичайні блоки ініціалізації
(також спочатку батьківських класів, якщо клас наслідується від іншого класу);
останні виконуються конструктори.

 */