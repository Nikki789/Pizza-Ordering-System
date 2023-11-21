package pizza_package;

//Defining the enumerated types,which will be stored in a local variable
public enum Size {
    SMALL(9.45),MEDIUM(11.87),LARGE(15.90);
    
    private double sizePrice;
    
    
//Constructor 
Size(double price) {
    //this.sizePrice - member variable,price - the actual value
    this.sizePrice = price;
}

//Get method
public double getSizePrice(){
    return this.sizePrice;
}
}


