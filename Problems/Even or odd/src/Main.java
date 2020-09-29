import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //Get the input number from the user
        int number = scanner.nextInt();

        //keep going until the input is 0
        while(number != 0) {
            //keep receiving input
            int remainder = number % 2;
            if (remainder == 0) {
                //odd - like me
                System.out.println("even");
            } else {
                //not odd - normie
                System.out.println("odd");
            }

            number = scanner.nextInt();

            if(number == 0){
                return;
            }
        }
    }
}