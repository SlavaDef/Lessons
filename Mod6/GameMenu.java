package Mod6;

 class GameMenu {

    void act(MenuItem item){

        System.out.println(item.getAction());
    }

    abstract static class MenuItem{
        abstract String getAction() ;

    }

   static  class Start extends MenuItem{
       @Override
         String getAction(){
          return "start";

        }
    }

    static class Options extends MenuItem{
        @Override
        String getAction(){
           return "options";
        }
    }

    static class Exit extends MenuItem{
        @Override
        String getAction(){
           return  "exit";
        }
    }



}
class GameMenuTest {
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();

        //options
        menu.act(new GameMenu.Options());

        //start
        menu.act(new GameMenu.Start());

        //exit
        menu.act(new GameMenu.Exit());
    }
}

/*

class GameMenu {

    void act(MenuItem item){
        item.getAction();
    }

    abstract static class MenuItem{
        abstract void getAction();



    }

   static  class Start extends MenuItem{
       @Override
        void getAction(){
           System.out.println("start");
        }
    }

    static class Options extends MenuItem{
        @Override
        void getAction(){
            System.out.println("options");
        }
    }

    static class Exit extends MenuItem{
        @Override
        void getAction(){
            System.out.println("exit");
        }
    }



}
 */