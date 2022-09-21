package chapter5;

public class BreakPractice {
    public static void main(String[] args) {
        int counter;
        for (counter = 1; counter <= 10; counter++) {
            if (counter == 5) {
                break;
            }
            System.out.printf("%d  ", counter);
        }
        System.out.printf("%n%nCounter broke out of the loop @ %d",counter);
    }
}