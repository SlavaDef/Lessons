package Mod5;

public class SpaceRocketLauncher {

    private int bigRocketCount;
    private int smallRocketCount;


    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount){

        if(bigRocketCount>0 && bigRocketCount<100){
            this.bigRocketCount = bigRocketCount;
        }
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount){
        if(smallRocketCount >0 && smallRocketCount <= 100){
            this.smallRocketCount = smallRocketCount;
        }

    }

    public void launchBigRocket(){

        if (bigRocketCount > 0) {
            bigRocketCount--;
            System.out.print("Launch big rocket\n");
        }
    }

    public void launchSmallRocket() {
        if (smallRocketCount > 0) {
        smallRocketCount--;
        System.out.print("Launch small rocket\n");
    }
    }

    public int getTotalPower(){

return
        (bigRocketCount*100) + (smallRocketCount*50);


    }

    public static void main(String[] args) {
        SpaceRocketLauncher launcher = new SpaceRocketLauncher();
        launcher.setBigRocketCount(5);
        launcher.setSmallRocketCount(10);

        System.out.println("Power is " + launcher.getTotalPower());

        launcher.launchBigRocket();
        System.out.println("Big rocket count is " + launcher.getBigRocketCount());

        launcher.launchSmallRocket();
        System.out.println("Small rocket count is " + launcher.getSmallRocketCount());

        System.out.println("Power is " + launcher.getTotalPower());
    }

}
