package org.example.UsersDto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class HttpUtilUser {

    private static final HttpClient CLIENT = HttpClient.newHttpClient(); // зробили Http кліента
    private static final Gson GSON = new Gson();

    public static HttpResponse<String> getResponse(String url,String method,HttpRequest.BodyPublisher body) throws IOException,InterruptedException{
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .header("Content-type", " application/json")
                .method(method, body)
                .build();
        return CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
    }


    public static User createUser(User user) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .POST(HttpRequest.BodyPublishers.ofString(GSON.toJson(user)))
                .build();
        HttpResponse <String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("response.statusCode() = " + response.body());

        return GSON.fromJson((String) response.body(),User.class);

    }

    public static User updateUser(User user) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/5"))
                .PUT(HttpRequest.BodyPublishers.ofString(GSON.toJson(user)))
                .build();
        HttpResponse <String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("response.statusCode() = " + response.body());

        return GSON.fromJson((String) response.body(),User.class);
    }

    public static User deleteUser(User user) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/7"))
                .DELETE()
                .build();
        HttpResponse <String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("response.statusCode() = " + response.body());

        return GSON.fromJson((String) response.body(),User.class);

    }

    public static User infoAllUsers() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users"))
                .GET()
                //.version(HttpClient.Version.HTTP_1_1)
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("response.statusCode() = " + response.statusCode());
        System.out.println("response.statusCode() = " + response.body());

        return GSON.fromJson((String) response.body(),User.class);

    }

    public static void getUserById(String id) throws IOException, InterruptedException {
        HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();
        String url = String.format("https://jsonplaceholder.typicode.com/users/%s", id);
        HttpResponse<String> response = getResponse(url,"GET",bodyPublisher);
        System.out.println("userById = " + response.body());
    }

    public void getUserByName(String userName) throws IOException, InterruptedException {
        HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();
        String url = String.format("https://jsonplaceholder.typicode.com/users?username=%s", userName);
        HttpResponse<String> response = getResponse(url,"GET",bodyPublisher);
        System.out.println("userByName = " + response.body());
    }

    public void showAllOpenTasks(String id) throws IOException, InterruptedException{
        HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();
        String url = String.format("https://jsonplaceholder.typicode.com/users/%s/todos",id);
        HttpResponse<String> response = getResponse(url,"GET",bodyPublisher);
        Type type = new TypeToken<ArrayList<UsersList>>() {}.getType();
        List<UsersList> list = GSON.fromJson(response.body(), type);
        for (UsersList user : list) {
            if (!user.isCompleted()){
                System.out.println(user);
            }
        }
    }
    public void showAllCommentsToPost(String id) throws IOException, InterruptedException{
        HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();
        String url = String.format("https://jsonplaceholder.typicode.com/users/%s/posts",id);
        HttpResponse<String> response = getResponse(url,"GET",bodyPublisher);
        Type type = new TypeToken<ArrayList<UserPosts>>() {}.getType();
        List<UserPosts> list = GSON.fromJson(response.body(), type);
        int lastPost = list.get(list.size() - 1).getId();
        String line = String.format("https://jsonplaceholder.typicode.com/posts/%s/comments",lastPost);
        HttpResponse<String> allPosts = getResponse(line,"GET",bodyPublisher);
        System.out.println("response1.body() = " + allPosts.body());
        GSON.toJson(allPosts.body(), new FileWriter(String.format("user-%s-post-%s-comments.json",id,lastPost)));
    }

}

