package com.example;

import java.util.List;
import java.util.ArrayList;

public class UserService {

    private List<String> users = new ArrayList<>();

    public void addUser(String user) {
        users.add(user);
    }

    public void clearUsers() {
        users.clear();
    }

    public List<String> getUsers() {
        return new ArrayList<>(users);
    }
}
