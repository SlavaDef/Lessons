package Mod6;

 class TexturePool {

     private TexturePool(){

     }

     private static TexturePool instance = new TexturePool(); // зробили пиблічний статичний обьект з силкою на новій обьект

     public static  TexturePool getInstance(){ // гетером повертаемо цю ссілку
         return instance;
     }


     public String getTexture(String textureName){

         return "Get texture " + textureName;
     }

}

class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}
