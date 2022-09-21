package chapter3;

import java.util.Scanner;

/*Initialize passes to zero
        2 Initialize failures to zero
        3 Initialize student counter to one
        4
        5 While student counter is less than or equal to 10
        6 Prompt the user to enter the next exam result
        7 Input the next exam result
        8
        9 If the student passed
        10 Add one to passes
        11 Else
        12 Add one to failures
        13
        14 Add one to student counter
        15
        16 Print the number of passes
        17 Print the number of failures
        18
        19 If more than eight students passed
        20 Print “Bonus to instructor!*/

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass = 0;
        int fail = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.println("Enter next result");
            int result = input.nextInt();
            if (result > 5) {

                pass++;
            } else {
                fail++;

            }
            counter++;
        }
            System.out.printf(" %d student passed %n",pass);
            System.out.printf("%d student failed",fail);

            if(pass > 8){
                System.out.println("Bonus to instructor!");
            }

    }
}


