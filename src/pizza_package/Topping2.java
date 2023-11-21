package pizza_package;

public enum Topping2 {
    NONE(0.00),OLIVES(0.08),EXTRA_CHEESE(0.02),CHILLI(0.06),PEPPERONI(0.10),MUSHROOM(0.03),ROCKET(0.05),JALAPENOS(0.20),ONION(0.07),ANCHOVY(0.09);
    
    private double topping2Price;
    
    
//Constructor 
Topping2(double price) {
    this.topping2Price = price;
}

//Get method
public double getTopping2Price(){
    return this.topping2Price;
}
}
