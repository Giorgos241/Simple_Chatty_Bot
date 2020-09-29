import java.util.*;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        
        // put your code here
        Scanner scanner = new Scanner(System.in);
        char character = 'J';
        
     
      
        while(scanner.hasNextLine()){
                    String input = scanner.nextLine();
                    if(input.toUpperCase().charAt(0) == character){
                System.out.println("true");
                    }else{
                        System.out.println("false");
                    }
        }


        

    }
}
