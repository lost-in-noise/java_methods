package org.example;

public class Main {
    static void main() {

        String fullName = "My name is Nancy Kikvadze";
        System.out.println(fullName.contains("Nancy"));
        System.out.println(fullName.length());
        printName();
        printLastName();
    }

    static void printName() {
        System.out.println("My name is Nancy");
    }

    static void printLastName() {
        System.out.println("My last name is Kikvadze");
    }
}
