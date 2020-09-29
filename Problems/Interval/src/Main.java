import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        //start pilling the snake code
        if(number>-15 && number<13 || number>14 && number<17|| number>18){

            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}