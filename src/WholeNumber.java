import java.util.Scanner;
public class WholeNumber {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");

        int score = input.nextInt();
        int special = 35;


        if (score < special) {
            System.out.print("Number is too low");
        } else if (score > special) {

            System.out.println("Number is too high");

        }

        if (score == special) {
            System.out.println("Perfect number");

        }
    }
}