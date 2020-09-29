import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //import for the scanner
        Scanner input = new Scanner(System.in);

        // put your code here
        String string = input.nextLine();
        Integer number1 = input.nextInt();
        Integer number2 = input.nextInt();

        System.out.println(string.substring(number1,number2+1));


    }
}