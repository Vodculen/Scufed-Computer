import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MusicEditor {
    public static void musicMainMenu() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        System.out.println("Do you want to do?");

        System.out.println();
        System.out.println("1. New Sheet Music");
        System.out.println("2. Delete Sheet Music");
        System.out.println("3. Read Sheet Music");
        System.out.println("4. Back"); 
        System.out.println();

        String userschoice = usersInput.nextLine();

        if (userschoice.equalsIgnoreCase("1")) {
            Thread.sleep(200);
            musicKey();
        }
        if (userschoice.equalsIgnoreCase("2")) {
            Thread.sleep(200);
            musicDelete();
        }
        if (userschoice.equalsIgnoreCase("3")) {
            Thread.sleep(200);
            musicRead();
        }
        if (userschoice.equalsIgnoreCase("4")) {
            Thread.sleep(200);
            Home.homePage();
        }

    }

    public static void musicAdd() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        System.out.print("Sheet Music Name: ");
        String usersMusicName = usersInput.nextLine();
        Thread.sleep(200);
        System.out.println("Type Done when done!");
       
        try {
            FileWriter myWriter = new FileWriter(usersMusicName +  ".txt");
            
            String usersNotes = usersInput.nextLine();
            while (!usersNotes.equalsIgnoreCase("Done")) {
                myWriter.write(usersNotes + "\n");
                usersNotes = usersInput.nextLine(); 
            }
            myWriter.close();
            Thread.sleep(200);
            System.out.println(usersMusicName + " saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving " + usersMusicName + ".");
            e.printStackTrace();
        }
        Thread.sleep(200);
        musicMainMenu();
    }

    public static void musicDelete() throws Exception {
       Scanner userInput = new Scanner(System.in);
        listFiles();
        
        System.out.print("Delete Sheet Music: ");
        String usersDeleteMusic = userInput.nextLine();
        Thread.sleep(200);
        
        try {
            File myObj = new File(usersDeleteMusic + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading" + usersDeleteMusic + "or" + usersDeleteMusic + "does not exist.");
            e.printStackTrace();
            return;
        }

        System.out.println("Do you want to delete " + usersDeleteMusic + "? (Yes/No)");
        String usersDeleteChoice = userInput.nextLine();
        Thread.sleep(200);

        if (usersDeleteChoice.equalsIgnoreCase("Yes")) {
            File myObj = new File(usersDeleteMusic + ".txt");
            if (myObj.delete()) {
                System.out.println("Deleted " + usersDeleteMusic);
            } else {
                System.out.println("Failed to delete " + usersDeleteMusic + ".");
            }
        } else {
            System.out.println(usersDeleteMusic + " deletion canceled.");
        }
        try {
            File existingFile = new File("MusicList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(existingFile));
            StringBuffer buffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.equals(usersDeleteMusic)) {
                    buffer.append(line);
                    buffer.append("\n");
                }
            }
            reader.close();

            FileWriter writer = new FileWriter(existingFile);
            writer.write(buffer.toString());
            writer.close();

            Thread.sleep(200);
            System.out.println("Deleted " + usersDeleteMusic + " from the list.");
        } catch (IOException e) {
            System.out.println("An error occurred while deleting " + usersDeleteMusic + " from the list.");
            e.printStackTrace();
        }
        musicMainMenu();
    }

    public static void musicRead() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        listFiles();

        String usersEditChoice = usersInput.nextLine();
        Thread.sleep(200);
        try {
            File myObj = new File(usersEditChoice + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
        }
        myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        musicMainMenu();
    }

    public static void listFiles() throws Exception {
        System.out.println("List of all sheet music:");
        Thread.sleep(200);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("MusicList.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the existing file.");
            e.printStackTrace();
        }
    }

    public static void musicKey() throws Exception {
        try {
            File myObj = new File("MusicHelp.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
        }
        System.out.println();
        musicAdd();
    }
}
