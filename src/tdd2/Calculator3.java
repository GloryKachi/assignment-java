package tdd2;

public class Calculator3 {
    public int addTwoNumbers( int num1,int num2 ) {
        return num1 + num2;
    }

    public int minusTwoNumbers( int num1,int num2) {
        return num1 - num2;
    }

    public int multiplyTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public int collectUserInput(int input1, int input2, int input3) {
        if (input1 <= 0 || input2 <= 0 || input3 <= 0) {
            System.out.printf("%s%n", "Invalid input");
        }
        return input1 + input2 + input3;

    }
}
