import java.util.Scanner;

public class BlackJack {
    public static void blackjackHome() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        boolean tied = false;
        boolean lost = false;
        boolean won = false;

        int userCardValue = 0;
        int aiCardValue = 0;
        int firstCard = (int)(Math.random() * 10 + 1);
        int secondCard = (int)(Math.random() * 10 + 1);
        int aiFirstCard = (int)(Math.random() * 10 + 1);
        int aiSecondCard = (int)(Math.random() * 10 + 1);
        int aiFirstDraw = (int)(Math.random() * 3);
        int aiChoice = (int)(Math.random() * 11);
        
        if (aiFirstDraw <= 3) {
            System.out.println("Dealers Value " + aiFirstCard);
            aiFirstCard = aiCardValue;
        }
        if (aiFirstDraw <= 7) {
            System.out.println("Dealers Value " + aiSecondCard);
            aiSecondCard = aiCardValue;
        }
        if (aiFirstDraw <= 10) {
            System.out.print("Dealers Value ");
            System.out.println(aiFirstCard + aiSecondCard);
            aiCardValue = aiFirstCard + aiSecondCard;
        }
       
        System.out.println();
        System.out.println("Your Hand");
        System.out.println("1. " + firstCard);
        System.out.println("2. " + secondCard);

        String usersChoice = usersInput.nextLine();
        Thread.sleep(200);

        if (usersChoice.equalsIgnoreCase("1")) {
            System.out.print("Users Value ");
            System.out.println(firstCard);
            userCardValue = firstCard;
        }
        if (usersChoice.equalsIgnoreCase("2")) {
            System.out.println("Users Value ");
            System.out.println(secondCard);
            userCardValue = secondCard;
        }
        if (usersChoice.equalsIgnoreCase("Both")) {
            System.out.print("Users Value ");
            System.out.println(secondCard + firstCard);
            userCardValue = firstCard + secondCard;
        }

        do {
            Thread.sleep(200);
            String usersPicked = usersInput.nextLine();
            Thread.sleep(200);
            if (usersPicked.equalsIgnoreCase("Hit")) {
                int randomNum = (int)(Math.random() * 10 + 1);
                userCardValue += randomNum;
                System.out.println("Users Value " + userCardValue);
            }
            if (usersPicked.equalsIgnoreCase("Stand")) {
                System.out.println("User Stand at " + userCardValue);
            }
            int aiRandomNum = (int)(Math.random() * 11 + 1);

            if (aiChoice <= 3) {
                aiCardValue += aiRandomNum;
                System.out.println("Dealers Value " + aiCardValue);
            }
            if (aiChoice >= 4) {
                System.out.println("Dealer Stand at " + aiCardValue);
                
            }

            if (userCardValue > 21 || aiCardValue == 21 || usersPicked.equalsIgnoreCase("Stand") && aiChoice >= 4 && aiCardValue > userCardValue) {
                Thread.sleep(200);
                System.out.println("Bust!");
                lost = true;
            }
            if (userCardValue == aiCardValue && userCardValue >= 21 && aiCardValue >= 21) {
                Thread.sleep(200);
                System.out.println("Push!");
                tied = true;
            }
            if (userCardValue == 21 || aiCardValue > 21 || usersPicked.equalsIgnoreCase("Stand") && aiChoice <= 4 && aiCardValue > userCardValue) {
                Thread.sleep(200);
                System.out.println("User Won!");
                won = true;
                
            }
            if (won == true || lost == true || tied == true) {
                Thread.sleep(200);
                System.out.println();
                System.out.println("Exit");
                System.out.println("Play agian");
                System.out.println();

            String usersNextChoice = usersInput.nextLine();

            if (usersNextChoice.equalsIgnoreCase("Exit")) {
                Thread.sleep(200);
                GameHub.gameHub();
            }
            if (usersNextChoice.equalsIgnoreCase("Play agian")) {
                Thread.sleep(200);
                BlackJack.blackjackHome();
            }
        }
            aiChoice = (int)(Math.random() * 6);
        } 
        while (lost != true || won != true || tied != true);

        
        
    }
}
