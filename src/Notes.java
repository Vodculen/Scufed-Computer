import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Notes {
    public static void notesMainMenu() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        System.out.println("Do you want to do?");
        Thread.sleep(200);

        System.out.println();
        System.out.println("1. New Note");
        System.out.println("2. Delete Note");
        System.out.println("3. Read Note");
        System.out.println("4. Edit Note");
        System.out.println("5. Back"); 
        System.out.println();
        Thread.sleep(200);

        String userschoice = usersInput.nextLine();

        if (userschoice.equalsIgnoreCase("1")) {
            Thread.sleep(200);
            notesAdd();
        }
        if (userschoice.equalsIgnoreCase("2")) {
            Thread.sleep(200);
            notesDelete();
        }
        if (userschoice.equalsIgnoreCase("3")) {
            Thread.sleep(200);
            notesRead();
        }
        if (userschoice.equalsIgnoreCase("4")) {
            Thread.sleep(200);
            notesEdit();
        }
        if (userschoice.equalsIgnoreCase("5")) {
            Thread.sleep(200);
            Home.homePage();
        }

    }

    public static void notesAdd() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        System.out.println();
        System.out.print("Note Name: ");
        String usersNoteName = usersInput.nextLine();
        Thread.sleep(200);
        System.out.println("Type Done when done!");

        try {
            String existingContent = Files.lines(Paths.get(usersNoteName + ".txt"))
                .collect(Collectors.joining("\n"));
            
            FileWriter myWriter = new FileWriter(usersNoteName +  ".txt");
            myWriter.write(existingContent + "\n");
            
            String usersNotes = usersInput.nextLine();
            while (!usersNotes.equalsIgnoreCase("Done")) {
                myWriter.write(usersNotes + "\n");
                usersNotes = usersInput.nextLine(); 
            }
            myWriter.close();
            System.out.println(usersNoteName + " saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving " + usersNoteName + ".");
            e.printStackTrace();
        }
        Thread.sleep(200);
        notesMainMenu();
    }

    public static void notesDelete() throws Exception {
       Scanner userInput = new Scanner(System.in);
        listFiles();
        Thread.sleep(200);
        
        System.out.print("Delete Note: ");
        String usersDeleteNote = userInput.nextLine();
        Thread.sleep(200);
        
        try {
            File myObj = new File(usersDeleteNote + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading" + usersDeleteNote + "or" + usersDeleteNote + "does not exist.");
            e.printStackTrace();
            return;
        }

        System.out.println("Do you want to delete " + usersDeleteNote + "? (Yes/No)");
        String usersDeleteChoice = userInput.nextLine();
        Thread.sleep(200);

        if (usersDeleteChoice.equalsIgnoreCase("Yes")) {
            File myObj = new File(usersDeleteNote + ".txt");
            if (myObj.delete()) {
                System.out.println("Deleted " + usersDeleteNote);
            } else {
                System.out.println("Failed to delete " + usersDeleteNote + ".");
            }
        } else {
            System.out.println(usersDeleteNote + " deletion canceled.");
        }
        try {
            File existingFile = new File("NoteList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(existingFile));
            StringBuffer buffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.equals(usersDeleteNote)) {
                    buffer.append(line);
                    buffer.append("\n");
                }
            }
            reader.close();

            FileWriter writer = new FileWriter(existingFile);
            writer.write(buffer.toString());
            writer.close();
            Thread.sleep(200);
            
            System.out.println("Deleted " + usersDeleteNote + " from the list.");
        } catch (IOException e) {
            System.out.println("An error occurred while deleting " + usersDeleteNote + " from the list.");
            e.printStackTrace();
        }
        Thread.sleep(200);
        notesMainMenu();
    }
    public static void notesEdit() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        listFiles();
        Thread.sleep(200);
        
        System.out.print("Edit Note: ");
        String usersEditNote = usersInput.nextLine();

        try {
            File myObj = new File(usersEditNote + ".txt");
            Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("Type Done when done!");

        try {
            String existingContent = Files.lines(Paths.get(usersEditNote + ".txt"))
                .collect(Collectors.joining("\n"));
            
            FileWriter myWriter = new FileWriter(usersEditNote +  ".txt");
            myWriter.write(existingContent + "\n");
            
            String usersNotes = usersInput.nextLine();
            while (!usersNotes.equalsIgnoreCase("Done")) {
                myWriter.write(usersNotes + "\n");
                usersNotes = usersInput.nextLine(); 
            }
            Thread.sleep(200);
            myWriter.close();
            System.out.println(usersEditNote + " saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving " + usersEditNote + ".");
            e.printStackTrace();
        }
        Thread.sleep(200);
        notesMainMenu();
    }

    public static void notesRead() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        listFiles();
        Thread.sleep(200);

        System.out.print("Edit Note: ");
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
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        notesMainMenu();
    }

    public static void listFiles() throws Exception {
        System.out.println("List of all files:");
        Thread.sleep(200);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("NoteList.txt"));
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
}
