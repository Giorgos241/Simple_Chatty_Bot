import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        //Scanner here for the amount of cups and the weekend verification

        boolean party;
        int cupNum = scanner.nextInt();
        boolean boolWeekend = scanner.nextBoolean();

        if(boolWeekend == false) {
            if (cupNum > 9 && cupNum < 21) {
                party = true;
                System.out.print(party);
            }else{
                party=false;
                System.out.print(party);
            }
        }
        if(boolWeekend == true) {
            if(cupNum > 14 && cupNum < 26){
                party = true;
                System.out.print(party);
            }else{
                party=false;
                System.out.print(party);}
        }


    }
}