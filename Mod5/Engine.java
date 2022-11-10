package Mod5;

public class Engine {

   private int power;


   public int getPower() {return power; }

    public void setPower(int power) { this.power=power;}

    public String getFuelType(){

       return "A500";
    }




    public static void main(String[] args) {
        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000
    }

}

class XFuelEngine extends Engine{

    protected String serialNumber;

    public void setSerialNumber(String serialNumber){ this.serialNumber = serialNumber;}



    public String getFuelType(){

        return "XFuel";
    }

}

class AdvancedXFuelEngine extends XFuelEngine{

    public  void printInfo(){
System.out.print( "Serial number is " + serialNumber + ", power is " + getPower());

    }



}