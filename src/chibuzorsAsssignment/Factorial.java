package chibuzorsAsssignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        int no =1;
        int factorial=1;
        while (no <= number){
            factorial = factorial * no;
            no++;
        }
        System.out.printf("The number is %d and the factorial is %d", number, factorial);
    }
}
