package pizza_package;

import java.util.ArrayList;

public class Order {
    private ArrayList<Pizza> pizzas;



    public Order(){
        this.pizzas = new ArrayList<Pizza>();
    }
    
    
    public void addPizza(Size size,Crust crust,Sauce sauce,Topping1 topping1,Topping2 topping2){
        Pizza p = new Pizza(size, crust, sauce,topping1,topping2);
        pizzas.add(p);
 }
    
    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }
    

    public int numberOfPizzas(){
        return this.pizzas.size();
        }
      

    
    public double calculateCostOfWholeOrder(){
        double total = 0;
        for(Pizza p : pizzas) {
                total += p.totalCost();
                String totalCost = String.format("%.2f",total);
                total = Double.valueOf(totalCost);
        }
        return total;
        }
    
    
    public void updatePizza(int index,Size newSize,Crust newCrust, Topping1 newTopping1,Topping2 newTopping2,Sauce newSauce){
        Pizza p = this.pizzas.get(index);
        p.setSize(newSize);
        p.setCrust(newCrust);
        p.setTopping1(newTopping1);
        p.setTopping2(newTopping2);
        p.setSauce(newSauce); 
    } 
    
    
    
    public void deletePizza(int index){
        Pizza p = this.pizzas.get(index);
                pizzas.remove(p);
        }
     
    
    public String getOnePizzaInfo(int index){
        for (Pizza p:pizzas){
            if (pizzas.indexOf(p)==index){
                return p.Info();
            }
        }
        return "";
    }
    /*
    public String getOnePizzaInfo1(int index){
            Pizza p = this.pizzas.get(index);
            return p.Info();
    }
*/
    
    public String getAllPizzasInfo(){
        String info = "";
        for(Pizza p:pizzas){
            info = info + p.Info() + "\n";
      
    }
    return info;
}
}

