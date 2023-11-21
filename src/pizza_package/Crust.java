package pizza_package;

//Defining the enumerated types,which will be stored in a local variable
public enum Crust {
    THIN(1.08),DEEP(1.10),STUFFED(2.14);
    
    private double crustPrice;
    
    
//Constructor 
Crust(double crustPrice) {
    this.crustPrice = crustPrice;
}

//Get price method
public double getCrustPrice(){
    return this.crustPrice;
}
}
