package HomeworkMod10;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWorkTen {

    static void firstMethod(String text) throws IOException {
        File file = new File(text);
        try (InputStream fis = new FileInputStream(file);
             Scanner scanner = new Scanner(fis)) {
            while (scanner.hasNext()) {
                String number = scanner.nextLine();
                boolean res = number.matches("^\\(?(\\d{3}\\)?[- ]?(\\d{3})[-](\\d{4})$)");
                if (res) {
                    System.out.println(number);
                }
            }
        }
    }
    static void methodThirt(String file) throws IOException {
        Map<String, Integer> wordsTimes = new HashMap<>();
        try (InputStream fis = new FileInputStream(file);
             Scanner scanner = new Scanner(fis)) {
            while (scanner.hasNext()) {
                String line = scanner.next();
                if (wordsTimes.containsKey(line)) {
                    int current = wordsTimes.get(line);
                    wordsTimes.put(line, current + 1);
                } else {
                    wordsTimes.put(line, 1);
                }
            }
        }
        wordsTimes.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}