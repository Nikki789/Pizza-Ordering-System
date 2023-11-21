package pizza_package;

public class Test {
    public static void main(String[] args) {
        System.out.println("-----------PIZZA CLASS TESTS-----------");
        System.out.println("---------------------------------------");
        System.out.println("PIZZA CREATION WITH FOLLOWING DATA:\n" +
                "Size.MEDIUM, \n" + 
                "Crust.THIN, \n" + 
                "Sauce.PESTO, \n" +
                "Topping.EXTRA_CHEESE, \n" +
                "Topping.CHILLI");
        
        
        Pizza p = new Pizza(Size.MEDIUM,
                Crust.THIN,
                Sauce.PESTO,
                Topping1.EXTRA_CHEESE,
                Topping2.CHILLI);
        
        System.out.println("\n-----------INFO METHOD-----------------");
        System.out.println("---------------------------------------");
        System.out.println(p.Info());
        
        System.out.println("\n---CHANGE THE FOLLOWING USING SET METHODS---\n" +
                "Size.MEDIUM, \n" + 
                "Crust.STUFFED, \n" +
                "Topping.OLIVE, \n" +
                "Topping.ONION");
        
        p.setSize(Size.MEDIUM);
        p.setCrust(Crust.THIN);
        p.setSauce(Sauce.PESTO);
        p.setTopping1(Topping1.EXTRA_CHEESE);
        p.setTopping2(Topping2.CHILLI);
        
        System.out.println("\n-----------INFO METHOD-----------------");
        System.out.println("---------------------------------------");
        System.out.println(p.Info());
        
        System.out.println("\n-----------GET METHODS-----------\n" +
                "Size.MEDIUM, \n" + 
                "Crust.STUFFED, \n" +
                "Topping.OLIVE, \n" +
                "Topping.ONION");
        
        System.out.println(p.getSize());
        System.out.println(p.getCrust());
        System.out.println(p.getSauce());
        System.out.println(p.getTopping1());
        System.out.println(p.getTopping2());
        
        
        System.out.println("\n-----------ORDER CLASS TESTS-------------");
        System.out.println("-----------------------------------------");
        System.out.println("EMPTY ORDER CREATION");
        
        Order o = new Order();
        
        
        System.out.println("\nPIZZA 1 CREATE & ADD TO ORDER:\n" +
                "Size.MEDIUM, \n" + 
                "Crust.THIN, \n" +
                "Topping.PESTO, \n" +
                "Topping.EXTRA_CHEESE, \n" +
                "Topping.CHILLI");
        
        Pizza pz1 = new Pizza(
                Size.MEDIUM,
                Crust.STUFFED,
                Sauce.PESTO,
                Topping1.EXTRA_CHEESE,
                Topping2.CHILLI);
        
        o.addPizza(pz1);
        
        
        System.out.println("\nPIZZA 2 CREATE & ADD TO ORDER:\n" +
                "Size.MEDIUM, \n" + 
                "Crust.THIN, \n" +
                "Topping.PESTO, \n" +
                "Topping.OLIVES, \n" +
                "Topping.ONION");
        
        Pizza pz2 = new Pizza(
                Size.MEDIUM,
                Crust.THIN,
                Sauce.PESTO,
                Topping1.OLIVES,
                Topping2.ONION);
        
        o.addPizza(pz2);
        
        
        System.out.println("\n-----------ADD PIZZA METHOD-------------");
        System.out.println("----------------------------------------");
        o.addPizza(
                Size.SMALL,
                Crust.THIN,
                Sauce.PESTO,
                Topping1.NONE,
                Topping2.ONION);
        
        System.out.println("\n-----------INFO METHOD-----------------");
        System.out.println("---------------------------------------");
        System.out.println(o.getAllPizzasInfo());
        
        
        System.out.println("\n-----------NUMBER OF PIZZAS METHOD-------------");
        System.out.println("-----------------------------------------------");
        System.out.println(o.numberOfPizzas());
        
        System.out.println("\n-----------CALCULATE COST OF WHOLE ORDER METHOD-------------");
        System.out.println("------------------------------------------------------------");
        System.out.println(o.calculateCostOfWholeOrder());
        
        System.out.println("\n-----------UPDATE PIZZA METHOD-------------");
        System.out.println("-------------------------------------------");
        o.updatePizza(1,Size.SMALL,Crust.THIN,Topping1.EXTRA_CHEESE,Topping2.MUSHROOM,Sauce.TOMATO);
        
        System.out.println("\n-----------INFO METHOD-----------");
        System.out.println("---------------------------------");
        System.out.println(o.getAllPizzasInfo());
        
        System.out.println("\n-----------DELETE PIZZA METHOD-------------");
        System.out.println("-------------------------------------------");
        o.deletePizza(2);
        
        
        System.out.println("\n-----------INFO METHOD-------------");
        System.out.println("-----------------------------------");
        System.out.println(o.getAllPizzasInfo());
        
        
        System.out.println("\n-----------GET ONE PIZZA INFO METHOD FOR THE GUI-------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println(o.getOnePizzaInfo(1));
    }
}
