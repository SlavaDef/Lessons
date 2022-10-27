package Mod4;

public class DigitSplitter {

    public int getFirstDigit(int number) {
            return number/10;

    }

    public int getSecondDigit(int number){
        return number % 10;

    }



    public boolean isDensityOk(int density) {

        if ((density>=1000 & density<=5000)|(density>=10000 & density<=15000)){
            return true;
        }
        return false;
    }

    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid){

        return acidValue > minAcid & acidValue < maxAcid;

    }

    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold){

return isAcidOk( acidValue,minAcid,maxAcid );

    }

    public static void main(String[] args) {
           System.out.print( new DigitSplitter().isDensityOk(10000));
        //System.out.print(41%41);
    }


}
