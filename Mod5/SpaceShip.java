package Mod5;

public class SpaceShip {


    private String name;
    private  String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }

        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {

        if (serialNumber.startsWith("SN") && serialNumber.length()<9) {
            this.serialNumber = serialNumber;
        }

         /*if (serialNumber.length() != 8) {
            return;
        }

        if (!serialNumber.startsWith("SN")) {
            return;
        }

        this.serialNumber = serialNumber;

        */

    }

   void printInfo(){
        System.out.print("Name is "+ name+ ", serial number is " + serialNumber);


    }



    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setSerialNumber("SN50678855");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE1234568");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value
    }

}
