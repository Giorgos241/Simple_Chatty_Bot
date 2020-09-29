import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //Get the input number from the user
        int number = scanner.nextInt();
        //start a counter.
        int sum = 1;
        int printed = 1;

        while (number>=printed){
            printed = sum * sum;
            sum++;
            if(printed>number){
                break;
            }else {
                System.out.println(printed);
            }
        }
    }
}