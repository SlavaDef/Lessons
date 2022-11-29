package Mod6;

 class TexturePool {




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
