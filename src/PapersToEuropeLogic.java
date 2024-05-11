import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PapersToEuropeLogic {
    public static void logicDayOne() throws Exception {
        String filePathText = "DayOneText.txt";
        String filePathCompare = "DayOneCompare.txt";
        do { 
            int randomNum = (int)(Math.random() * 20 + 1);
            int lineNumber = randomNum;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePathText))) {
            String line;
            int currentLine = 1;

            while ((line = reader.readLine()) != null && currentLine < lineNumber) {
                currentLine++;
            }

            if (currentLine == lineNumber && line != null) {
                if (lineNumber == 1 || lineNumber == 4 || lineNumber == 5 || lineNumber == 7 || lineNumber == 11 || lineNumber == 12 || lineNumber == 15 || lineNumber == 17) {
                    System.out.println(line);
                }
                if (lineNumber == 2 || lineNumber == 3 || lineNumber == 6 || lineNumber == 8 || lineNumber == 9 || lineNumber == 10 || lineNumber == 13 || lineNumber == 14 || lineNumber == 16 || lineNumber == 18 || lineNumber == 19 || lineNumber == 20) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filePathCompare))) {
            String line;
            int currentLine = 1;

            while ((line = reader.readLine()) != null && currentLine < lineNumber) {
                currentLine++;
            }

            if (currentLine == lineNumber && line != null) {
                if (lineNumber == 1 || lineNumber == 4 || lineNumber == 5 || lineNumber == 7 || lineNumber == 11 || lineNumber == 12 || lineNumber == 13 || lineNumber == 15) {
                    System.out.println(line);
                    PapersToEurope.trueAnswers();
                }
                if (lineNumber == 2 || lineNumber == 3 || lineNumber == 6 || lineNumber == 8 || lineNumber == 9 || lineNumber == 10 || lineNumber == 13 || lineNumber == 14 || lineNumber == 16 || lineNumber == 18 || lineNumber == 19 || lineNumber == 20) {
                    System.out.println(line);
                    PapersToEurope.falseAnswers();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
        } while (true);
        
    }
    public static void logicDayTwo() {
        
    }
    public static void logicDayThree() {
        
    }
}
