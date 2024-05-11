import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Credentials {
    public static void oldUsername() throws Exception {
        Scanner usersInput = new Scanner(System.in);
        
        System.out.print("Enter Old Username:");
        String userText = usersInput.nextLine().trim();
        System.out.println();
        Thread.sleep(200);

        try {
            String fileContent = readFile("Username.txt").trim();

            if (userText.equals(fileContent)) {
                oldPassword();
            } else {
                oldUsername();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public static void oldPassword() throws Exception {
        Scanner usersInput = new Scanner(System.in);
        
        System.out.print("Enter Old Password: ");
        String usersPassword = usersInput.nextLine().trim();
        System.out.println();
        Thread.sleep(200);
        try {
            String fileContent = readFile("Username.txt").trim();

            if (usersPassword.equals(fileContent)) {
                newPasskeyAndUsername();
            } else {
                oldUsername();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public static void newPasskeyAndUsername() throws Exception {
        Scanner usersInput = new Scanner(System.in);
        
        System.out.println();
        System.out.print("New Username: ");
        String usersUsername = usersInput.nextLine();
        System.out.println();
        Thread.sleep(200);

        try {
            FileWriter myWriter = new FileWriter("Username.txt");
            myWriter.write(usersUsername + "\n");
            myWriter.close();
        } 
        catch (IOException e) {
            System.out.println("An error occurred while writing the username to file.");
            e.printStackTrace();
        }

        System.out.println();
        System.out.print("New Password: ");
        String usersPassword = usersInput.nextLine();
        System.out.println();
        Thread.sleep(200);

        try {
            FileWriter myWriter = new FileWriter("Password.txt");
            myWriter.write(usersPassword + "\n");
            myWriter.close();
        } 
        catch (IOException e) {
            System.out.println("An error occurred while writing the password to file.");
            e.printStackTrace();
        }
        Home.homePage();
    }
    public static String readFile(String fileName) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                contentBuilder.append(scanner.nextLine());
                contentBuilder.append("\n");
            }
        }
        return contentBuilder.toString();
    }

}
