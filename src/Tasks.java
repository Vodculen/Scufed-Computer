import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tasks {
    public static void time() throws Exception {
        Scanner usersInput = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date getDate = new Date();

        System.out.println();  
        System.out.println(formatter.format(getDate));
        System.out.println();

        String dummyHit = usersInput.nextLine();
        Thread.sleep(500);

        Home.homePage();
    }
    
}