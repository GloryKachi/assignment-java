package chapter6;

public class Iphone {
    private String color;
    private static int price;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void setPrice(int price) {
        Iphone.price = price;
    }

    public static int getPrice() {
        return price;
    }
}


