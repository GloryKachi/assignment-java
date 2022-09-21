package chapter7;

/*Create an array and initialize it with values. Sum all the values in the array and print them out. Also write a pseudocode*/

public class ArrayAssignment {
    public static void main(String[] args) {


        int[] sum = {7,2,5,1,4,9,3};
         int total = 0;

         for (int addition = 0; addition < sum.length; addition++){
             total += sum[addition];
         }
        System.out.printf("%d is the sum of all the values",total);
    }
}
