package org.example;

import java.util.Arrays;
import java.util.Objects;

public class User {

    private int id;
    private  String name;
    private String username;
    private String email;
    private String [] adress = { "street", "suite", "city", "zipcode" };
    private String [] geo = { "lat", "lng" };
    private String phone;
    private String website;
    private String [] company = {"name", "catchPhrase", "bs" };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getAdress() {
        return adress;
    }

    public void setAdress(String[] adress) {
        this.adress = adress;
    }

    public String[] getGeo() {
        return geo;
    }

    public void setGeo(String[] geo) {
        this.geo = geo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String[] getCompany() {
        return company;
    }

    public void setCompany(String[] company) {
        this.company = company;
    }

    public User(int id, String name, String username, String email) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User abUser = (User) o;
        return id == abUser.id && Objects.equals(name, abUser.name) && Objects.equals(username, abUser.username) && Objects.equals(email, abUser.email) && Arrays.equals(adress, abUser.adress) && Arrays.equals(geo, abUser.geo) && Objects.equals(phone, abUser.phone) && Objects.equals(website, abUser.website) && Arrays.equals(company, abUser.company);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, username, email, phone, website);
        result = 31 * result + Arrays.hashCode(adress);
        result = 31 * result + Arrays.hashCode(geo);
        result = 31 * result + Arrays.hashCode(company);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /*

    "id": 1,
    "name": "Leanne Graham",
    "username": "Bret",
    "email": "Sincere@april.biz",
    "address": {
      "street": "Kulas Light",
      "suite": "Apt. 556",
      "city": "Gwenborough",
      "zipcode": "92998-3874",
      "geo": {
        "lat": "-37.3159",
        "lng": "81.1496"
      }
    },
    "phone": "1-770-736-8031 x56442",
    "website": "hildegard.org",
    "company": {
      "name": "Romaguera-Crona",
      "catchPhrase": "Multi-layered client-server neural-net",
      "bs": "harness real-time e-markets"
     */
}
