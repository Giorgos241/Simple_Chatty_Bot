import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
    Scanner scanner = new Scanner(System.in);

    String string1 = scanner.nextLine();
    String string2 = scanner.nextLine();

//    string1 =string1.replaceAll("\\s+","");
//    string2 =string2.replaceAll("\\s+","");

        if(string1.replaceAll("\\s+","").equals(string2.replaceAll("\\s+",""))){
            System.out.print("true");
        }else{
            System.out.println("false");
        }
    }
}