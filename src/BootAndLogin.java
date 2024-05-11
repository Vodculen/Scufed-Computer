import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BootAndLogin {
    public static void main(String[] args) throws Exception {
        boot();
    }
    public static void boot() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        System.out.println("Press Enter to Boot");

        String boot = usersInput.nextLine();

        System.out.println("Booting...");

        Thread.sleep(3500);

        login();
    }
    public static void login() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        String username = readUsernameFromFile("Username.txt");
        String password = readUsernameFromFile("Password.txt");

        System.out.print("Password: ");

        String usersPin = usersInput.nextLine();

        if (usersPin.equals(password)) {
            Thread.sleep(1500);

            System.out.println();
            System.out.println();
            System.out.println("Welcome to Vindauls " + username + "!");

        Thread.sleep(1500);
            Home.homePage();
        }
    }
    public static String readUsernameFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String username = reader.readLine();
        reader.close();
        return username;
    }
}