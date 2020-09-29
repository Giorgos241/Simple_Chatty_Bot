import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here

        //Get the input from the user
        Scanner scanner = new Scanner(System.in);



        int number = scanner.nextInt();
        int sum = 0;
        //if the number is negative (bellow zero) we dont want to count it.
        for(int i=1;i<=number;i++){

            System.out.println(sum);
            sum += (i*i);
            //number = scanner.nextInt();


        }

    }
}