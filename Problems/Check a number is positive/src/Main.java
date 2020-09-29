import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        //read input
        Scanner scanner = new Scanner(System.in);
        //initiate an int
        int number = scanner.nextInt();

        if(number >0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }

    }
}