import java.util.Scanner;

public class CoffeeMath { 
    public static void myMethod() throws Exception {

        Scanner usersInput = new Scanner(System.in);

        double totalMoney = 30;

        boolean done = false;

        do {
            System.out.println("You Have:  $" + totalMoney + "0"); 
            System.out.println();           
            String userPicked = usersInput.nextLine();
            Thread.sleep(200);

            if (userPicked.equalsIgnoreCase("Coffee")) {
                totalMoney = totalMoney - 2.00;
            }
            if (userPicked.equalsIgnoreCase("Light Coffee")) {
                totalMoney = totalMoney - 2.50;
            }
            if (userPicked.equalsIgnoreCase("Coffee w/ Cream")) {
                totalMoney = totalMoney - 3.00;
            }
            if (userPicked.equalsIgnoreCase("Coffee w/ Surgar")) {
                totalMoney = totalMoney - 3.00;
            }
            if (userPicked.equalsIgnoreCase("Latte")) {
                totalMoney = totalMoney - 3.50;
            }
            if (userPicked.equalsIgnoreCase("Frapachino")) {
                totalMoney = totalMoney - 3.50;
            }
            if (userPicked.equalsIgnoreCase("Cappachino")) {
                totalMoney = totalMoney - 4.00;
            }
            if (userPicked.equalsIgnoreCase("Mocha")) {
                totalMoney = totalMoney - 4.00;
            }
            if (userPicked.equalsIgnoreCase("Done")) {
                done = true;
                System.out.println("You Have:  $" + totalMoney + "0"); 
                System.out.println("Have a good day!");
                System.out.println();
                Thread.sleep(200);
                System.out.println("Game Complete");
                System.out.println();
                Thread.sleep(200);
                System.out.println("Replay");
                System.out.println("Exit");
                Thread.sleep(200);

                String back = usersInput.nextLine();

                if (userPicked.equals("Exit")) {
                    GameHub.gameHub();
                }
                if (userPicked.equals("Replay")) {
                    Coffee.gamePage();
                }
            }
            if (totalMoney <= 0) {
                done = true;
                System.out.println("Sorry, we dont want you to go further into debt!");
                System.out.println("You Have:  $" + totalMoney); 
                System.out.println("Have a good day!");
                System.out.println();
                Thread.sleep(200);
                System.out.println("Game Complete");
                System.out.println();
                Thread.sleep(200);
                System.out.println("Replay");
                System.out.println("Exit");
                Thread.sleep(200);

                String back = usersInput.nextLine();

                if (userPicked.equals("Exit")) {
                    GameHub.gameHub();
                }
                if (userPicked.equals("Replay")) {
                    Coffee.gamePage();
                }
            }
        }
        while (done != true);
    }
}
