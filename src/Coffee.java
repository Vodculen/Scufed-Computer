public class Coffee {
    public static void gamePage() throws Exception {
        String[] coffee = {"Coffee              |", "Light Coffee        |" , "Coffee w/ Cream     |", "Coffee w/ Surgar    |", "Latte               |", "Frapachino          |", "Cappachino          |", "Mocha               |"};
        String[] prices = {"  $2", "  $2.50", "  $3", "  $3", "  $3.50", "  $3.50", "  $4", "  $4"};
        System.out.println();

        for (int numOfCoffee = 0; numOfCoffee <= 7; numOfCoffee++) {
            Thread.sleep(50);
            System.out.println(coffee[numOfCoffee] + prices[numOfCoffee]);
        }
        System.out.println();
      
        CoffeeMath.myMethod();
    }        
}