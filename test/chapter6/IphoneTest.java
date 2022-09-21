package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IphoneTest {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.setColor("Gray");
        System.out.println("The color of my phone is " + iphone.getColor());

        Iphone.setPrice(500_000);
        System.out.println("The price of my phone is " + Iphone.getPrice());


        }



}