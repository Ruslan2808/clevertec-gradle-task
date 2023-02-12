package ru.clevertec;

public class App {

    public static void main(String[] args) {
        boolean isAllPositiveNumber = Utils.isAllPositiveNumbers("12", "79");
        System.out.println("Are all numbers in the string positive? " + isAllPositiveNumber);
    }

}