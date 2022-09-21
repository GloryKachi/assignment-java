import java.util.Scanner;  // Program performs a sample payroll calculation

public class Multiplication{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer");
        int b = input.nextInt();

        System.out.println("Enter integer");
        int c = input.nextInt();

        int a = b*c;

        System.out.printf("%d%n: Your result is", a);
    }
}

