import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Images {
    public static void imagesHome() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        System.out.println();
        System.out.println("Do you want to do?");
        System.out.println();
        System.out.println("1. New Image");
        System.out.println("2. Delete Image");
        System.out.println("3. View Image");
        System.out.println("4. Back"); 
        System.out.println();

        String userschoice = usersInput.nextLine();

        if (userschoice.equalsIgnoreCase("1")) {
            Thread.sleep(200);
            imagesAdd();
        }
        if (userschoice.equalsIgnoreCase("2")) {
            Thread.sleep(200);
            imagesDelete();
        }
        if (userschoice.equalsIgnoreCase("3")) {
            Thread.sleep(200);
            imagesRead();
        }
        if (userschoice.equalsIgnoreCase("4")) {
            Thread.sleep(200);
            Home.homePage();
        }
    }

    public static void imagesAdd() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        System.out.println();
        System.out.print("Image Name: ");
        String usersImageName = usersInput.nextLine();
        System.out.println("Type Done when done!");

        try {
            FileWriter myWriter = new FileWriter(usersImageName +  ".txt");
            String usersImages = usersInput.nextLine();
            while (!usersImages.equalsIgnoreCase("Done")) {
                myWriter.write(usersImages + "\n");
                usersImages = usersInput.nextLine(); 
            }
            myWriter.close();
            Thread.sleep(200);
            System.out.println(usersImageName + " saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving " + usersImageName + ".");
            e.printStackTrace();
        }
        Thread.sleep(200);
        imagesHome();
    }

    public static void imagesDelete() throws Exception {
        Scanner userInput = new Scanner(System.in);
        listFiles();
        
        System.out.print("Delete Image: ");
        String usersDeleteImage = userInput.nextLine();

        Thread.sleep(200);
        
        try {
            File myObj = new File(usersDeleteImage + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading" + usersDeleteImage + "or" + usersDeleteImage + "does not exist.");
            e.printStackTrace();
            return;
        }

        System.out.println("Do you want to delete " + usersDeleteImage + "? (Yes/No)");
        String usersDeleteChoice = userInput.nextLine();

        Thread.sleep(200);

        if (usersDeleteChoice.equalsIgnoreCase("Yes")) {
            File myObj = new File(usersDeleteImage + ".txt");
            if (myObj.delete()) {
                System.out.println("Deleted " + usersDeleteImage);
            } else {
                System.out.println("Failed to delete " + usersDeleteImage + ".");
            }
        } else {
            System.out.println(usersDeleteImage + " deletion canceled.");
        }
        try {
            File existingFile = new File("ImageList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(existingFile));
            StringBuffer buffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.equals(usersDeleteImage)) {
                    buffer.append(line);
                    buffer.append("\n");
                }
            }
            reader.close();
            
            FileWriter writer = new FileWriter(existingFile);
            writer.write(buffer.toString());
            writer.close();
            Thread.sleep(200);
            
            System.out.println("Deleted " + usersDeleteImage + " name from the list.");
        } catch (IOException e) {
            System.out.println("An error occurred while deleting " + usersDeleteImage + " name from the list.");
            e.printStackTrace();
        }
        Thread.sleep(200);
        imagesHome();
    }

    public static void imagesRead() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        listFiles();

        System.out.print("See Image: ");
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
        Thread.sleep(200);
        imagesHome();
    }

    public static void listFiles() throws Exception {
        System.out.println("List of all images:");
        Thread.sleep(200);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("ImageList.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the existing image.");
            e.printStackTrace();
        }
    }
}
