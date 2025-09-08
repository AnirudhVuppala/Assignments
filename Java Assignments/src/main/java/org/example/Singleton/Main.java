package org.example.Singleton;

public class Main {
    public static void main(String[] args) {
        DBConnection a = DBConnection.getInstance();
        DBConnection b = DBConnection.getInstance();
        DBConnection c = DBConnection.getInstance();

        System.out.println("a == b: " + (a == b));
        System.out.println("b == c: " + (b == c));
        System.out.println("c == a: " + (c == a));
    }}
