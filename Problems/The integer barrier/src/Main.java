import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num = -1;


        while(num != 0 || sum < 1000){
            num = input.nextInt();
            sum = sum+num;
            if(num == 0){
                System.out.println(+ (sum));
            break;
            }
            if( sum >=1000){
                System.out.println( + (sum - 1000));
            break;
            }
        }

        }

    }
