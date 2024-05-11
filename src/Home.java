import java.util.Scanner;

public class Home {
    public static void homePage() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("1. Time");
        System.out.println("2. Calculator");
        System.out.println("3. Notes");
        System.out.println("4. Game Hub");
        System.out.println("5. Images");
        System.out.println("6. Music Editor");
        System.out.println("7. Settings");
        System.out.println("8. Logout");
        System.out.println();

        String usersChoice = usersInput.nextLine();

        if (usersChoice.equalsIgnoreCase("1")) {
            Thread.sleep(200);
            Tasks.time();
        }
        if (usersChoice.equalsIgnoreCase("2")) {
            Thread.sleep(200);
            Calculator.calculatorHome();
        }
        if (usersChoice.equalsIgnoreCase("3")) {
            Thread.sleep(200);
            Notes.notesMainMenu();
        }
        if (usersChoice.equalsIgnoreCase("4")) {
            Thread.sleep(200);
            GameHub.gameHub();
        }
        if (usersChoice.equalsIgnoreCase("5")) {
            Thread.sleep(200);
            Images.imagesHome();
        }
        if (usersChoice.equalsIgnoreCase("6")) {
            Thread.sleep(200);
            MusicEditor.musicMainMenu();
        }
        if (usersChoice.equalsIgnoreCase("7")) {
            Thread.sleep(200);
            Credentials.oldUsername();
        }
        if (usersChoice.equalsIgnoreCase("8")) {
            Thread.sleep(200);
            BootAndLogin.boot();
        }
    }
}
