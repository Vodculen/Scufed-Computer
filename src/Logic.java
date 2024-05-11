import java.util.Scanner;

public class Logic {
    public static void addingStuff() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        float usersFirstValueNum;
        float usersSecondValueNum;   
         
        System.out.println("First Value:");
        String usersFirstValue = usersInput.nextLine();
        usersFirstValueNum = Float.parseFloat(usersFirstValue);
        System.out.println();
        Thread.sleep(200);
        System.out.println("Second Value:");
        String usersSecondValue = usersInput.nextLine();
        usersSecondValueNum = Float.parseFloat(usersSecondValue);
        System.out.println();
        Thread.sleep(200);  
        System.out.println("Total:");
        System.out.println(usersFirstValueNum + usersSecondValueNum);
        String dummyPress = usersInput.nextLine();
        Thread.sleep(200);

        Calculator.calculatorHome();
    }
    public static void subtractingStuff() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        float usersFirstValueNum;
        float usersSecondValueNum;   
         
        System.out.println("First Value:");
        String usersFirstValue = usersInput.nextLine();
        usersFirstValueNum = Float.parseFloat(usersFirstValue);
        System.out.println();
        Thread.sleep(200);
        System.out.println("Second Value:");
        String usersSecondValue = usersInput.nextLine();
        usersSecondValueNum = Float.parseFloat(usersSecondValue);
        System.out.println();
        Thread.sleep(200);  
        System.out.println("Total:");
        System.out.println(usersFirstValueNum - usersSecondValueNum);
        String dummyPress = usersInput.nextLine();
        Thread.sleep(200);

        Calculator.calculatorHome();
    }
    public static void mutiplyingStuff() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        float usersFirstValueNum;
        float usersSecondValueNum;   
         
        System.out.println("First Value:");
        String usersFirstValue = usersInput.nextLine();
        usersFirstValueNum = Float.parseFloat(usersFirstValue);
        System.out.println();
        Thread.sleep(200);
        System.out.println("Second Value:");
        String usersSecondValue = usersInput.nextLine();
        usersSecondValueNum = Float.parseFloat(usersSecondValue);
        System.out.println();
        Thread.sleep(200); 
        System.out.println("Total:");
        System.out.println(usersFirstValueNum * usersSecondValueNum);
        String dummyPress = usersInput.nextLine();
        Thread.sleep(200);

        Calculator.calculatorHome();
    }
    public static void dividingStuff() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        float usersFirstValueNum;
        float usersSecondValueNum;   
         
        System.out.println("First Value:");
        String usersFirstValue = usersInput.nextLine();
        usersFirstValueNum = Float.parseFloat(usersFirstValue);
        System.out.println();
        Thread.sleep(200);
        System.out.println("Second Value:");
        String usersSecondValue = usersInput.nextLine();
        usersSecondValueNum = Float.parseFloat(usersSecondValue);
        System.out.println();
        Thread.sleep(200);
        System.out.println("Total:");
        System.out.println(usersFirstValueNum / usersSecondValueNum);
        String dummyPress = usersInput.nextLine();
        Thread.sleep(200);

        Calculator.calculatorHome();
    }
    public static void poweringStuff() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        float usersFirstValueNum;
        float usersSecondValueNum;   
         
        System.out.println("First Value:");
        String usersFirstValue = usersInput.nextLine();
        usersFirstValueNum = Float.parseFloat(usersFirstValue);
        System.out.println();
        Thread.sleep(200);
        System.out.println("Second Value:");
        String usersSecondValue = usersInput.nextLine();
        usersSecondValueNum = Float.parseFloat(usersSecondValue);
        System.out.println();
        Thread.sleep(200);
        System.out.println("Total:");
        System.out.println(Math.pow(usersFirstValueNum, usersSecondValueNum));
        String dummyPress = usersInput.nextLine();
        Thread.sleep(200);

        Calculator.calculatorHome();
    }
    public static void sqrtStuff() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        float usersFirstValueNum;   
         
        System.out.println("Value:");
        String usersFirstValue = usersInput.nextLine();
        usersFirstValueNum = Float.parseFloat(usersFirstValue);
        Thread.sleep(200);

        System.out.println();  
        System.out.println("Total:");
        System.out.println(Math.sqrt(usersFirstValueNum));
        String dummyPress = usersInput.nextLine();
        Thread.sleep(200);

        Calculator.calculatorHome();
    }
    public static void cbrtStuff() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        float usersFirstValueNum;   
         
        System.out.println("Value:");
        String usersFirstValue = usersInput.nextLine();
        usersFirstValueNum = Float.parseFloat(usersFirstValue);
        Thread.sleep(200);

        System.out.println();  
        System.out.println("Total:");
        System.out.println(Math.cbrt(usersFirstValueNum));
        String dummyPress = usersInput.nextLine();
        Thread.sleep(200);

        Calculator.calculatorHome();
    }
    public static void logerithemStuff() throws Exception {
        Scanner usersInput = new Scanner(System.in);

        float usersFirstValueNum; 
         
        System.out.println("First Value:");
        String usersFirstValue = usersInput.nextLine();
        usersFirstValueNum = Float.parseFloat(usersFirstValue);
        System.out.println();
        Thread.sleep(200);
        System.out.println("Total:");
        System.out.println(Math.log(usersFirstValueNum));
        String dummyPress = usersInput.nextLine();
        Thread.sleep(200);

        Calculator.calculatorHome();
    }
}
