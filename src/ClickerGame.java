import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClickerGame {
    public static void clickerHome() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        boolean done = false;
        boolean doubleUpgrade = false;
        boolean bonusUpgrade = false;
        boolean friendUpgrade = false;

        int score = 500;

        System.out.println("Type Exit to exit the game!");

        do {
            String hasDoubleUpgrade = readFile("hasDoubleUpgrade.txt").trim();
            String hasBonusUpgrade = readFile("hasBonusUpgrade.txt").trim();
            String hasFriendUpgrade = readFile("hasFriendUpgrade.txt").trim();
            String userClicks = usersInput.nextLine();

            if (userClicks.equalsIgnoreCase("Shop")) {
                System.out.println("Double Click");
                System.out.println("Quicker Clicks");
                System.out.println("Clicker Companion");

                String userUpgradeChoice = usersInput.nextLine();

                if (userUpgradeChoice.equalsIgnoreCase("Double Click") && score >= 50) {
                    doubleUpgrade = true;
                    score -= 50;
                    String existingContent = Files.lines(Paths.get("hasDoubleUpgrade.txt"))
                        .collect(Collectors.joining("\n"));
            
                    FileWriter myWriter = new FileWriter("GamehasDoubleUpgrade.txt");
                    myWriter.write(existingContent + "\n");
                    myWriter.write("hasDoubleUpgrade");
                    myWriter.close();
                }
                if (userUpgradeChoice.equalsIgnoreCase("Clicker Compainion") && score >= 200) {
                    friendUpgrade = true;
                    score -= 200;
                    String existingContent = Files.lines(Paths.get("hasFriendUpgrade.txt"))
                        .collect(Collectors.joining("\n"));
            
                    FileWriter myWriter = new FileWriter("hasFriendUpgrade.txt");
                    myWriter.write(existingContent + "\n");
                    myWriter.write("hasFriendUpgrade");
                    myWriter.close();
                }
                if (userUpgradeChoice.equalsIgnoreCase("Bonus Clicks") && score >= 500) {
                    bonusUpgrade = true;
                    score -= 100;
                    String existingContent = Files.lines(Paths.get("hasBonusUpgrade.txt"))
                        .collect(Collectors.joining("\n"));
            
                    FileWriter myWriter = new FileWriter("hasBonusUpgrade.txt");
                    myWriter.write(existingContent + "\n");
                    myWriter.write("hasBonusUpgrade");
                    myWriter.close();
                }
            }

            System.out.println("Current score: " + score);

            if (hasDoubleUpgrade.equals("hasDoubleUpgrade")) {
                score += 2;
            } else {
                score++;
            }
            if (hasBonusUpgrade.equals("hasBonusUpgrade")) {
                int randomNum = (int)(Math.random() * 11);
                if (randomNum == 6) {
                    int randomMutipyler = (int)(Math.random() * 6);
                    String[] mutiplyer = {"1.1", "1.2", "1.3", "1.4", "1.5"};
                    float number = Float.parseFloat(mutiplyer[randomMutipyler]);
                    score *= number;
                }
                
                
            } else {
                Thread.sleep(500);
            }
            if (hasFriendUpgrade.equals("hasFriendUpgrade")) {
                Thread.sleep(5000);
                score += 20;
            }
            if (userClicks.equalsIgnoreCase("Exit")) {
                done = true;
            }
        }
        while (done != true);
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
