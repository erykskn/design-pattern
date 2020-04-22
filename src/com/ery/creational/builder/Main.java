package com.ery.creational.builder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Eray", "Keskin").birtDate(new Date()).address("Ankara").phone("0-000-000-00-00").build();
        System.out.println(user);
    }
}
