package ChapterTwo;

public class Comparison {
    public int getUserInput;


    public int getUserInput(int input1, int input2, int input3) {
        if (input1 <= 0 || input2 <= 0 || input3 <= 0) {

            System.out.println(input1 + "Number is invalid");
        }
        return input1 + input2 + input3;
    }

    public int getSubtractedInput(int input1, int input2, int input3) {
        if (input1 <= 0 || input2 <= 0 || input3 <= 0) {
            System.out.println("Number is invalid");
        }
        return input1 - input2 - input3;
    }

    public boolean getGreaterThan100(int input) {
        if (input >= 100) {
            System.out.println("Input is greater than 100");
        }
        return input > 100;
    }


    public boolean getSquareIsGreaterThan100(int number) {
        int square = number * number;
        //double number = Math.pow(square,4);
        return square > 100;
    }

    public boolean getUserInputIsLessThan100(int number) {
        if (number <= 100) {
            System.out.println("Number is less than 100");
        }
        return number < 100;
    }

    public boolean getSquareIsLessThan100(int number) {
        int square = number * number;
        return square < 100;
    }

    public boolean getIntegerIsEqualTo100(int number) {
        if (number == 100) {
            System.out.println("Number is equal to 100");
        }
        return number == 100;

    }

    public boolean getUserInputNotEqualTo100(int number) {
        if (number != 100) {
            System.out.println("Number is not equal to 100");
        }
        return number != 100;
    }
}