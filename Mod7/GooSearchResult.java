package Mod7;

import java.util.Arrays;

class GooSearchResult {

    private final String url;

    public GooSearchResult(String url){ this.url=url;}


    public String getUrl(){
        return  url;
    }

    public String parseDomain(){
        // StringBuilder st = new StringBuilder(url);
        String [] words = url.split( "/");




        //if(url.substring(0,7).equals("http://")){
            return      words[2];//url.substring(7);
      //  }

       // return url.substring(8);
    }


}

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}
