import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //put your code here.

        //Be negative about something
        boolean arrange;
        //Say something
        //System.out.println("Give the boys height");
        //Scan something
        int boy1 = scanner.nextInt();
        int boy2 = scanner.nextInt();
        int boy3 = scanner.nextInt();

        if((boy1 >= boy2 && boy2 >= boy3) || (boy1 <= boy2 && boy2 <= boy3))
        {
            arrange = true;
            //System.out.print("Arranged\b ");
        }else{
            arrange = false;
            //System.out.print("NOT Arranged\b ");
        }
        System.out.print(arrange);
    }
}