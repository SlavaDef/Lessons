package Mod5;

public class RocketLauncher {

    private String size;
    private int rocketCount;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getRocketCount() {
        return rocketCount;
    }

    public String toString(){
        return "Size is " + size + ", rocket count is " + rocketCount;
    }


    public void setRocketCount(int rocketCount) {
        this.rocketCount = rocketCount;
    }

    public static void main(String[] args) {
        RocketLauncher launcher = new RocketLauncher();
        launcher.setSize("big");
        launcher.setRocketCount(50);

        //Should be - Size is big, rocket count is 50
        System.out.println(launcher);
    }
}
