package chapter6;

public class SumUp {
    public int addNumbers(int num1,int num2){
        return num1 + num2;
    }
    public double addNumbers(int num1,double num2){
        double total = num1 + num2;
        //System.out.printf("%.1f",total);
        return  total;
    }
    public void addNumbers(double num1, double num2){
        double total = num1 + num2;
        System.out.printf("%.2f",total);
        //return total;
    }
    public double addNumbers(double num1,int num2){
        double total = num1 + num2;
        //System.out.printf("%.2f",total);
        return total;
    }

    public static void main(String[] args) {
        SumUp sumUp = new SumUp();
        System.out.println(sumUp.addNumbers(4,4));
        System.out.println();
        System.out.println(sumUp.addNumbers(4,4.5));
        System.out.println();
       // System.out.println(sumUp.addNumbers(20.2,11.2));
        sumUp.addNumbers(20.2,11.2);
        System.out.println();
        System.out.println();
        System.out.println(sumUp.addNumbers(7,2.5));
        System.out.println();
        System.out.println(sumUp.addNumbers(25.61,20));
        System.out.println();
    }
}
