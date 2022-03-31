package com.company;

public class Main {

    public static void main(String[] args) {
        Logic logic = new Logic();
        System.out.println(logic.encode("aaabbc"));
        System.out.println(logic.decode("40a2b1c"));
    }
}
