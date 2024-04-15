package org.example;

public class Main {
    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstance();
        appConfig.setUsername("User");
        appConfig.setPassword("1234");

        System.out.println(appConfig.getUsername());
        System.out.println(appConfig.getPassword());
    }
}