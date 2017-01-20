package com.daimamiao.hellospring.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by xcc on 1/20/2017.
 */
public class Account {
    private String name;

    private String pwd;

    private List<String> cities;

    private Set<String> friends;

    private Map<Integer, String> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Set<String> getFriends() {
        return friends;
    }

    public void setFriends(Set<String> friends) {
        this.friends = friends;
    }

    public Map<Integer, String> getBooks() {
        return books;
    }

    public void setBooks(Map<Integer, String> books) {
        this.books = books;
    }
}
