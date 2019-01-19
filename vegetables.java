import java.util.*;

public class vegetables {
    
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Have you eaten your vegetables? (Y/N)");
        String input = keyboard.nextLine();
        
        if(input.equals("Y")){
            System.out.println("Eat more");
        }
        else if(input.equals("N")) {
            System.out.println("Deleting Files....");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}