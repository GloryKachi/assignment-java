package chapter4;
/* Write Java statements to accomplish each of the following tasks:
         a) Use one statement to assign the sum of x and y to z, then increment x by 1.
         b) Test whether variable count is greater than 10. If it is, print "Count is greater than 10".
         c) Use one statement to decrement the variable x by 1, then subtract it from variable total
         and store the result in variable total.
         d) Calculate the remainder after q is divided by divisor, and assign the result to q. Write
         this statement in two different ways.*/
public class Add {
    public static void main(String[] args) {

        int x = 20;
        int y = 10;
        int z = 0;
        int count = 12;
        int total = 42;
        z = x + y;
        x++;

        if (count > 10) {
            System.out.printf("%d is greater than 10", count);
            x = x--;
            total = x - total;



        }
    }
}
