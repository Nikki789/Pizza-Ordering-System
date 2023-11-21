package pizza_package;

//Defining the enumerated types,which will be stored in a local variable
public enum Sauce {
    TOMATO(0.00),PESTO(0.50);
    
private double saucePrice;

//Constructor 
Sauce(double price){
    this.saucePrice=price;
}

//Get method
public double getSaucePrice(){
    return this.saucePrice;
}
    
}
