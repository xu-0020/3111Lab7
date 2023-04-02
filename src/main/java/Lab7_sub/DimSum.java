package Lab7_sub;

public class DimSum
{
    //
    // Task 1 - create the attributes
    //
    // The name of the dim sum
    // The price of the dim sum
    // The quantity ordered    
    String name;
    float price;
    int quantity;
    
    // Constructor of the class
    public DimSum(String name, float price) {
        //
        // Task 1 - Initialize the attributes of the dim sum
        // 
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }
    
    // Return the name of the dim sum
    public String getName() {
        //
        // Task 1 - Return the name of the dim sum
        //
        return this.name;
    }
    
    // Return the price of the dim sum
    public float getPrice() {
        //
        // Task 1 - Return the price of the dim sum
        //
        return this.price;
    }
    
    // Return the quantity ordered
    public int getQuantity() {
        //
        // Task 1 - Return the quantity of the dim sum
        // 
        return this.quantity;
    }
    
    // Order this dim sum dish
    public void order(int quantity) {
        //
        // Task 1 - Increase the quantity ordered
        //
        this.quantity += quantity;
    }
}

