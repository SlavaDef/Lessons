package Mod4;

import java.util.Arrays;

public class UberShop {

    public void printPrices(float[] prices) {
        for(int i = 0; i< prices.length; i++){
            System.out.println(prices[i] +" jup.");
        }

    }
    public int[] findMinMaxPrices(int[] prices) {
        int[] a = {};
        if (prices.length==0){

            return a;
        }

            Arrays.sort(prices);
        int [] newPrice = {prices[0],prices[prices.length-1]};
        int [] nums = {prices[0]};
       for(int i=0;i<prices.length;i++){
           if(newPrice[0]==newPrice[1]){
               return nums;
           }

       }

        return newPrice;

    }

    public void multiplyPrices(float[] prices){
        
        for(int i = 0; i< prices.length; i++){
            if(prices[i]<1000){
                prices[i] *= 2f;

            }
            else if (prices[i]>=1000){
                prices[i] *= 1.5f;
            }
        }
    }

   /* public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        for(int pr:prices) {
            if (prices[pr] == prices[pr]) {

                return prices.length;
            }
        }

       return prices;
    }
*/
    public static void main(String[] args) {

        UberShop shop = new UberShop();

        //Should be [50, 1500]
        int[] prices = new int[] {100, 1500, 300, 50, 10, 10, 70};
        //System.out.println(shop.getMinPriceCount(prices)); //Should be 2
    }
}


