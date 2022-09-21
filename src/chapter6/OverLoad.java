package chapter6;

public class OverLoad {
    public String buyPizza(String where){
        return "I bought pizza at " + where;
    }
    public String buyPizza(){
        return "I bought pizza at a random place";
    }
    public void buyPizza(String where, int price){
       System.out.printf("I bought pizza at %s for %d",where,price);
    }

    public static void main(String[] args) {
        OverLoad overLoad = new OverLoad();
        overLoad.buyPizza("Domino's",3700);
        System.out.println();
        System.out.println(overLoad.buyPizza("Domino's"));
        System.out.println();


    }

}
