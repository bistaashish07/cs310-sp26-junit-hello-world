package edu.jsu.mcis.cs310;

public class Main {

    public static String getGreeting() {
        return "Hello, World!";
    }

    public static String reverse(String s) {
        // Use StringBuilder for now
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(getGreeting());
        System.out.println(reverse(getGreeting()));
    }
}
