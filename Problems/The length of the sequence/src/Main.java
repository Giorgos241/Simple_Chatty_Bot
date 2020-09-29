import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here

        //Get the input from the user
        Scanner scanner = new Scanner(System.in);


        int i=0;
        int number = scanner.nextInt();

        //if the number is negative (bellow zero) we dont want to count it.
        while(number!=0 && number>0){
            number = scanner.nextInt();
            i++;
        }
        System.out.print(i);
    }
}