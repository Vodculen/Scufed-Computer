
import java.util.Scanner;


public class PapersToEurope {
    static int score = 0;
    static int penalty = 3;

    public static void gameHomePage() throws Exception {
        
        
        
        Scanner usersInput = new Scanner(System.in);
        System.out.println("Hit Enter when ready!");

        String dummyHit = usersInput.nextLine();

        PapersToEuropeLogic.logicDayOne();
        
    } 
    public static void trueAnswers() throws Exception {
        Scanner usersInput = new Scanner(System.in);
        String needsTrue = usersInput.nextLine();
        if (needsTrue.equalsIgnoreCase("Yes")) {
            score++;
            System.out.println(score);
        } else {
            penalty--;
            System.out.println(penalty);
        }
        if (penalty == 0) {
            System.out.println("You Lose");
        }
        
    }
    public static void falseAnswers() {
        Scanner usersInput = new Scanner(System.in);
        String needsFalse = usersInput.nextLine();
        if (needsFalse.equalsIgnoreCase("No")) {
            score++;
            System.out.println(score);
        } else {
            penalty--;
            System.out.println(penalty);
        }
        if (penalty == 0) {
            System.out.println("You Lose");
        }
    }
}
