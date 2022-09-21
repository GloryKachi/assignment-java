package chapter3;

/*(Class PetrolPurchase) Create a class called PetrolPurchase to represent information
        about the petrol you purchase. The class should include five pieces of information
        in the form of instance variables—the station’s location (type String),
        the type of petrol (type String), the quantity (type int) of the purchase in liters,
        the price per liter (double), and the percentage discount
        (double). Your class should have a constructor that initializes the five instance variables.
         Provide a set and a get method for each instance variable. In addition,
         provide a method named getPurchaseAmount that calculates the net
         purchase amount (i.e., multiplies the quantity by the price per liter)
         minus the discount, then returns the net amount you had to pay as a double value.
          Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase.
 */



public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantityOfLiters;
    private double price;
    private double percentageDiscount;

    public PetrolPurchase(String location,String petrolType,int quantityOfLiters,
                          double price,double percentageDiscount){
        this.location = location;
        this.petrolType = petrolType;
        this.quantityOfLiters = quantityOfLiters;
        this.price = price;
        this.percentageDiscount = percentageDiscount;
    }

    public void setLocation(String location) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setQuantityOfLiters(int quantityOfLiters) {
        this.quantityOfLiters = quantityOfLiters;
    }

    public int getQuantityOfLiters() {
        return quantityOfLiters;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void getPurchaseAmount(){
        int purchaseAmount = (int) (quantityOfLiters * price);
        purchaseAmount = (int) (purchaseAmount - percentageDiscount);

    }



}

