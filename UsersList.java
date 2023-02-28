package org.example.UsersDto;

public class UsersList {

    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "UserPosts{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
