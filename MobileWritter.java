package HomeworkMod10;

import java.io.*;
import java.util.Scanner;

public class MobileWritter {

    static void valideNumber(String file) throws IOException {
        File files = new File(file);
        try (InputStream fis = new FileInputStream(files);
             Scanner scanner = new Scanner(fis)) {
            while (scanner.hasNext()) {
                String number = scanner.nextLine();
                boolean resalt = number.matches("^\\(?(\\d{3}\\)?[- ]?(\\d{3})[-](\\d{4})$)");
                if(resalt){
                    System.out.println(number);
                }
            }
        }
    }
    }