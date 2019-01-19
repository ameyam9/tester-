import java.util.*;

public class vegetables {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you PINKY PROMISE to be honest?(Y/N)");
        String input = keyboard.nextLine();

        if (input.equals("Y")){
          System.out.println("thank you, 50 needles if you lied\n \n");
          System.out.println("Have you eaten your vegetables? (Y/N)");
          String input2 = keyboard.nextLine();
          if(input2.equals("Y")){
              System.out.println("Eat more");
          }
          else if(input2.equals("N")) {
              System.out.println("Deleting Files....");
          }
          else {
              System.out.println("Invalid Input");
          }
        } else if (input.equals("N")) {
          System.out.println("go home");
        } else {
          System.out.println("Answer bitch");
        }
    }
}
