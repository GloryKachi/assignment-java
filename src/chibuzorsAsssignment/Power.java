package chibuzorsAsssignment;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number or -1 ");
        int number = input.nextInt();

        int numberCounter = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        while (number != -1 ) {
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }

            System.out.println("Enter number or -1 ");
            number = input.nextInt();

            numberCounter++;
        }
        System.out.printf("The number is %d and the largest and smallest number is : %d and %d respectively", numberCounter,largest,smallest);

    }
}
