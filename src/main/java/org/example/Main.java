package org.example;

public class Main {
    static void main() {

        String fullName = "My name is Nancy Kikvadze";
        System.out.println(fullName.contains("Nancy"));
        System.out.println(fullName.length());
        printName();
        printLastName();
        printNameAndAge("Nancy", 38);
        int c = sumOfNumbers(5, 3);
        System.out.println(c);
        System.out.println(takeLoan(25));
        sumOfNumbers(5, 5, 7);
        skipTheFifthSymbol("overloading");
        printTheThirdNumber();
    }

    static void printName() {
        System.out.println("My name is Nancy");
    }

    static void printLastName() {
        System.out.println("My last name is Kikvadze");
    }

    static void printNameAndAge(String userName, int userAge) {
        System.out.println("my name is " + userName + " and my age is " + userAge);
    }

    static int sumOfNumbers(int a, int b) {
        return a + b;
    }

    static void sumOfNumbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    //    static void takeLoan(int age) {
//        if (age < 20) {
//            System.out.println("ვერ აიღებ სესხს, რადგან 20-ზე ნაკლები ხარ ასაკით");
//        } else if (age >= 20 & age <= 65) {
//            System.out.println("შენ შეგიძლია სესხის აღება");
//        } else {
//            System.out.println("ვერ აიღებ სესხს, რადგან ხარ 65+");
//        }
//    }
    static String takeLoan(int age) {
        String result;
        if (age < 20) {
            result = "ვერ აიღებ სესხს, რადგან 20-ზე ნაკლები ხარ ასაკით";
        } else if (age >= 20 & age <= 65) {
            result = "შენ შეგიძლია სესხის აღება";
        } else {
            result = "ვერ აიღებ სესხს, რადგან ხარ 65+";
        }
        return result;
    }

    static void skipTheFifthSymbol(String textForSkip) {
        for (int i = 0; i < textForSkip.length(); i++) {
            if (i == 5) continue;
            {
                System.out.println(textForSkip.charAt(i));

            }
        }
    }

    static void printTheThirdNumber() {
        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k += 3;

        }

    }
}
