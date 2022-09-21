package ChapterTwo;


public class Range {

    public int getUserInput(int num1,int num2,int num3) {
        if (num1 <= 0 || num2 <= 0 || num3 <= 0){
            System.out.println("Invalid number");
        }
        return num1 + num2 + num3;
    }

     public int getSumOfInput(int num1,int num2,int num3) {
         return num1 + num2 + num3;
     }


    public int getAverageInput(int num1,int num2,int num3) {
        int average = 0;
        if (num1 != 0.0 || num2 != 0.0 || num3 != 0.0) {
            int add = num1 + num2 + num3;
            average = add / 3;
        }
        return average;
    }

    public int getInputProduct(int num1,int num2,int num3) {
        return num1 * num2 * num3;
    }

    public boolean getSmallestNumber(int num1,int num2,int num3) {
        if (num1 < num2 && num1 < num3){
            System.out.printf("%d is the smallest number",num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.printf("%d is the smallest number",num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.printf("%d is the smallest number",num3);
        } else {
            System.out.println("All numbers are equal");
        }
        return true;
    }
    public boolean getLargestNumber(int num1,int num2,int num3) {
     if (num1 > num2 && num1 > num3){
         System.out.printf("%d is the largest number",num1);
     } else if (num2 > num1 && num2 > num3) {
         System.out.printf("%d is the largest number",num2);
     } else if (num3 > num1 && num3 > num2) {
         System.out.printf("%d is the largest number",num3);
     }else System.out.println("All numbers are equal");
        return true;
    }

}
