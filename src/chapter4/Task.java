package chapter4;
/*Write Java statements to accomplish each of the following tasks:
        a) Use one statement to assign the sum of x and y to z, then increment x by 1.
        b) Test whether variable count is greater than 10. If it is, print "Count is greater than 10".
        c) Use one statement to decrement the variable x by 1, then subtract it from variable total
        and store the result in variable total.
        d) Calculate the remainder after q is divided by divisor, and assign the result to q. Write
        this statement in two different ways.*/
public class Task {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int z = x + y;
        int total = 0;
        x = x++;
        if (x > 10){
            System.out.println("Count is greater than 10" + x);

            x = x - 1;
            total = x - total;
        }


    }
}
