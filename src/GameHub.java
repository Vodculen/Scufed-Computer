import java.util.Scanner;

public class GameHub {
    public static void gameHub() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        System.out.println();
        System.out.println("Available Games");
        System.out.println();
        System.out.println("1. Coffee Simulator");
        System.out.println("2. Key Clicker");
        System.out.println("3. Blackjack");
        System.out.println("4. Papers to Europe (Work In Progress)");
        System.out.println("5. Back");
        System.out.println();

        String usersChoice = usersInput.nextLine();

        if (usersChoice.equalsIgnoreCase("1")) {
            Thread.sleep(200);
            Coffee.gamePage();
        }
        if (usersChoice.equalsIgnoreCase("2")) {
            Thread.sleep(200);
            ClickerGame.clickerHome();
        }
        if (usersChoice.equalsIgnoreCase("3")) {
            Thread.sleep(200);
            BlackJack.blackjackHome();
        }
        if (usersChoice.equalsIgnoreCase("5")) {
            Thread.sleep(200);
            gameHub();
        }
        if (usersChoice.equalsIgnoreCase("5")) {
            Thread.sleep(200);
            Home.homePage();
        }
    }
}