package pizza_package;

//Defining the enumerated types,which will be stored in a local variable
public enum Topping1 {
    NONE(0.00),OLIVES(0.08),EXTRA_CHEESE(0.02),CHILLI(0.06),PEPPERONI(0.10),MUSHROOM(0.03),ROCKET(0.05),JALAPENOS(0.20),ONION(0.07),ANCHOVY(0.09);
    
    private double topping1Price;
    
    
//Constructor 
Topping1(double price) {
    this.topping1Price = price;
}

//Get method
public double getTopping1Price(){
    return this.topping1Price;
}
}