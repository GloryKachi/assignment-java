package gas;/*Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
from the user.*/

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int milesDriven = 0;
        int gallons = 0;
        double combined = 0;


        System.out.println("Enter miles driven or -1 to quit");
        milesDriven = input.nextInt();
        System.out.println("Enter number of gallons");
        gallons = input.nextInt();

        double total = 0;
        while (milesDriven != -1 && gallons != -1) {
            combined = (double) milesDriven / gallons;
            System.out.printf("Miles driven for each trip %.2f%n", combined);


            System.out.println("Enter miles driven or -1 to quit");
            milesDriven = input.nextInt();
            System.out.println("Enter number of gallons");
            gallons = input.nextInt();



            if (combined != 0) {

                total = total + combined;
            }
        }
        System.out.printf(" Combined miles for all trip is: %.2f", total);


    }

        }



