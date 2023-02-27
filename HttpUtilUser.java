package org.example;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpUtilUser {

    private static final HttpClient CLIENT = HttpClient.newHttpClient(); // зробили Http кліента
    private static final Gson GSON = new Gson();


    public static User createUser(User user) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .POST(HttpRequest.BodyPublishers.ofString(GSON.toJson(user)))
                .build();
        HttpResponse response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("response.statusCode() = " + response.body());

        return GSON.fromJson((String) response.body(),User.class);

    }

    public static User updateUser(User user) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/5"))
                .PUT(HttpRequest.BodyPublishers.ofString(GSON.toJson(user)))
                .build();
        HttpResponse response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("response.statusCode() = " + response.body());

        return GSON.fromJson((String) response.body(),User.class);
    }

    public static User deleteUser(User user) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/7"))
                .DELETE()
                .build();
        HttpResponse response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("response.statusCode() = " + response.body());

        return GSON.fromJson((String) response.body(),User.class);

    }

    public static User infoAllUsers() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("response.statusCode() = " + response.body());

        return GSON.fromJson((String) response.body(),User.class);

    }

}
