package chapter5;

public class Continue {
    public static void main(String[] args) {
        int counter;
        for (counter = 1; counter <= 10; counter++){
            if (counter == 5){
                continue;
            }
            System.out.printf("%d ",counter);
        }
        System.out.printf("%n%n Counter skipped number 5");
    }
}
