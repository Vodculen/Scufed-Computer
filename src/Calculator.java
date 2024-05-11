import java.util.Scanner;

public class Calculator {
    public static void calculatorHome() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Powers");
        System.out.println("6. Square Root");
        System.out.println("7. Cube Root");
        System.out.println("8. Logerithems");
        System.out.println("9. Back");
        System.out.println();

        String usersChoice = usersInput.nextLine();

        if (usersChoice.equalsIgnoreCase("1")) {
            Thread.sleep(200);
            Logic.addingStuff();
        }
        if (usersChoice.equalsIgnoreCase("2")) {
            Thread.sleep(200);
            Logic.subtractingStuff();
        }
        if (usersChoice.equalsIgnoreCase("3")) {
            Thread.sleep(200);
            Logic.mutiplyingStuff();
        }
        if (usersChoice.equalsIgnoreCase("4")) {
            Thread.sleep(200);
            Logic.dividingStuff();
        }
        if (usersChoice.equalsIgnoreCase("5")) {
            Thread.sleep(200);
            Logic.poweringStuff();
        }
        if (usersChoice.equalsIgnoreCase("6")) {
            Thread.sleep(200);
            Logic.sqrtStuff();
        }
        if (usersChoice.equalsIgnoreCase("7")) {
            Thread.sleep(200);
            Logic.cbrtStuff();
        }
        if (usersChoice.equalsIgnoreCase("8")) {
            Thread.sleep(200);
            Logic.logerithemStuff();
        }
        if (usersChoice.equalsIgnoreCase("9")) {
            Thread.sleep(200);
            Home.homePage();
        }
    }
}