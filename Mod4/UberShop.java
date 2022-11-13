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

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
           Arrays.sort(prices);
        int count = 0;

        for(int i = 0; i < prices.length; i++) {
            if (prices[0] == prices[i]) {
                count+=1;

            }
            //return count;
        }

       return count;
    }

    public int[] removePrice(int[] prices, int toRemove){

        /* return Arrays.stream(prices)
        .filter(number -> number != toRemove)
        .toArray(); */

        int toRemoveCount = 0; // счетчик
        for(int price: prices) { // для каждого элемента в массиве prices
            if (price == toRemove) { // если цена равняеться удалеемой (искомой) цене !!!
                toRemoveCount++; // счетчик увеличиваем на 1
            }
        }

        int[] result = new int[prices.length - toRemoveCount]; // новый массив с длинной в (длинна масива - счетчик)
        int index = 0; // переменная счетчик 2
        for(int price: prices) { // для каждого элемента в массиве prices
            if (price != toRemove) { // если элимент не равен искоемуму
                result[index] = price; // новый масив с индексом счетчика получает значение етого price
                index++;
            }
        }

        return result; // вернуть новый массив


    }

    public int[] leavePrice9(int[] prices){

        /* return Arrays.stream(prices)
                .filter(number -> number%10==9)
                .toArray(); */

// узнаем длинну нового массива

        int count = 0; // счетчик
        for(int priсe : prices){ // для каждого элемента в массиве prices
            if(priсe%10==9){ // если цена при остатке от деления на 10 не равна 9 !!!
                count++; // счетчик увеличиваем на 1
            }
        }
int[] priceWithNine = new int[count]; // новый массив с длинной в (длинна вход масива - счетчик)
        int index = 0; // переменная счетчик 2

        for(int priсe : prices){ // для каждого элемента в массиве prices
            if(priсe%10==9){ // если цена при остатке от деления на 10 равна 9
                priceWithNine[index]  = priсe; // // новый масив с индексом счетчика получает значение етого price
                index++;
            }
        }
       return priceWithNine;
    }
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){

        String[] stocks = new String[showcaseStocks.length + warehouseStocks.length];

int index = 0;

for ( String stock : showcaseStocks){
    stocks[index] = stock;
    index++;
}
int indexTwo = showcaseStocks.length;
        for ( String stock : warehouseStocks){
            stocks[indexTwo] = stock;
            indexTwo++;
        }

        return stocks;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice){

        int count= 0;

        for(int i = 0; i<prices.length; i++){
            if(prices[i]>=minPrice && prices[i]<=maxPrice){

                count+= prices[i];
                //System.out.print(prices[i]+" ");
            }
        }

        return count;
    }


    public static void main(String[] args) {

        UberShop shop = new UberShop();

        //Should be [50, 1500]
       // int[] prices = new int[] {100, 1500, 300, 50, 10, 70};
       // System.out.println(shop.getMinPriceCount(prices)); //Should be 2

        //Should be [150, 200]
        //int[] prices = new int[]{500, 200, 100, 200, 100};
        //int toRemove = 100;
        //System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));

      //  int[] prices = new int[] {399, 1599, 399, 50, 10, 10, 70};
       // System.out.println(Arrays.toString(shop.leavePrice9(prices)));

        //Final result should be ["gun", "firebow", "firegun"]
       // String[] showcaseStocks = new String[] {"gun", "firebow","jjfdfd","hhjdfjkd"};
       // String[] warehouseStocks = new String[] {"firegun","hfhdf"};
       //System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));

        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }
}


