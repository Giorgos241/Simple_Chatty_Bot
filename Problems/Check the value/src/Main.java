import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //put your code here.

        //Be negative about something
        boolean grump;
        //Say something
        //System.out.println("Give me a number");
        //Scan something
        int scannerInt = scanner.nextInt();

        if(scannerInt < 10 && scannerInt > 0)
        {
            grump = true;
            //System.out.print(grump);
        }else{
            grump = false;
            //System.out.print(grump);
        }
        System.out.print(grump);
    }
}