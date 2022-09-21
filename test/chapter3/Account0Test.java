package chapter3;

import static org.junit.jupiter.api.Assertions.*;

class Account0Test {
    public static void main(String[] args) {
        Account0 account0 = new Account0("Glory", 5000.00, 1960);

        System.out.println("My name is " + account0.getName());
    }
}