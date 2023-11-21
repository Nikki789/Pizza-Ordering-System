package pizza_package;
import java.util.*;

public class Pizza {
  
  //declaring variables,member variables
  private Size size;
  private Crust crust;
  private Sauce sauce;
  private Topping1 topping1;
  private Topping2 topping2;


  //constructor,in the brackets are the parameters
  //if i have a total cost member variable it shouldn't be used as a parameter,instead it can be set to 0 initially or it can call the method in the constructor
  public Pizza(Size size,Crust crust,Sauce sauce,Topping1 topping1,Topping2 topping2) {
      //member variables on the left of the equals
    this.size=size;
    this.crust=crust;
    this.sauce=sauce;
    this.topping1=topping1;
    this.topping2=topping2;
  }
  
  //setters
  public void setSize(Size size) {
      this.size = size;
  }
  
  public void setCrust(Crust crust) {
    this.crust = crust;
  }
  
  public void setTopping1(Topping1 topping1) {
    this.topping1 = topping1;
  }
  
  public void setTopping2(Topping2 topping2) {
    this.topping2 = topping2;
  }
  
  public void setSauce(Sauce sauce){
     this.sauce = sauce;
  }
  
  
  //get methods
  public Size getSize() {
      return this.size;
  }
  
  public double calculateSize(){
      double costOfSize = this.size.getSizePrice();
      return costOfSize;
  }
  
  public Crust getCrust() {
    return this.crust;
  }
  
public double calculateCrust(){
    double costOfCrust = this.crust.getCrustPrice();
    return costOfCrust;
  }
  
  public double calculateBase() {
      double costOfSize = this.size.getSizePrice();
      double costOfCrust = this.crust.getCrustPrice();
      double costInDouble = costOfSize + costOfCrust;
      String costInString = String.format("%.2f",costInDouble);
      return Double.valueOf(costInString);
  }
  
public Topping1 getTopping1() {
    return this.topping1;
}

  
 public double calculateTopping1() {
    double costOfTopping1 = this.topping1.getTopping1Price();
    return costOfTopping1*5;
  }


   public Topping2 getTopping2() {
    return this.topping2;
  }
 
 public double calculateTopping2() {
    double costOfTopping2 = this.topping2.getTopping2Price();
    double costInDouble = costOfTopping2*5;
    String costInString = String.format("%.2f",costInDouble);
    return Double.valueOf(costInString);
  }
  
 public Sauce getSauce(){
    return this.sauce = sauce;
  }
 
  public double calculateSauce(){
    double costOfSauce = this.sauce.getSaucePrice();
    return costOfSauce;
  }
 
 public double totalCost(){
    double costInDouble = calculateBase() + calculateTopping1() + calculateTopping2() + calculateSauce();
    String costInString = String.format("%.2f",costInDouble);
    return Double.valueOf(costInString);    
}  
   
  public String Info(){
     String sInfo = "";
     sInfo += "TOTAL COST: " + totalCost() + "\n";
     sInfo += this.size + " Size: " + calculateSize()+ "\n";
     sInfo += this.crust + " Crust: " + calculateCrust() + "\n";
     sInfo += "BASE COST: " + calculateBase()+ "\n";
     sInfo += this.topping1 + " Topping: " + calculateTopping1()+ "\n";
     sInfo += this.topping2 + " Topping: " + calculateTopping2()+ "\n";
     sInfo += this.sauce + " Sauce: " + calculateSauce()+ "\n";
     return sInfo; 
  }
}
  
 
