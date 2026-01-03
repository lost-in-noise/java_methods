package org.example;

public class Main {
    static void main() {

//        String fullName = "My name is Nancy Kikvadze";
//        System.out.println(fullName.contains("Nancy"));
//        System.out.println(fullName.length());
//        printName();
//        printLastName();
        printNameAndAge("Nancy", 38);
        int c = sumOfNumbers(5, 3);
        System.out.println(c);
    }

//    static void printName() {
//        System.out.println("My name is Nancy");
//    }
//
//    static void printLastName() {
//        System.out.println("My last name is Kikvadze");
//    }

    static void printNameAndAge(String userName, int userAge) {
        System.out.println("my name is " + userName + " and my age is " + userAge);
    }

    static int sumOfNumbers(int a, int b) {
        return a + b;
    }
}
