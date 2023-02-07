package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.*;

public class FromJson {

    static void fromFileToJsonMaker(String text) throws IOException {
        File file = new File(text);
        List<User> list = new ArrayList<>();
        try (InputStream fis = new FileInputStream(file);
             Scanner scanner = new Scanner(fis);
             PrintWriter out = new PrintWriter(new FileWriter("user.json"))) {
             scanner.nextLine();
            while (scanner.hasNext()) {
                String wo = scanner.nextLine();
                String[] wos = wo.split(" ");

                list.add(new User(wos[0], Integer.parseInt(wos[1])));
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(list);
            out.write(json);
        }
    }
}

class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name is = " + name+ ", age is "+ age;
    }
}