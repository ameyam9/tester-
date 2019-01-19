import java.io.*;

public class vegetables {


    public static void main(String[] args) {
        System.out.println("Do you PINKY PROMISE to be honest?(Y/N)");
        String input = getString();

        if (input.equals("Y")){
          System.out.println("thank you, 50 needles if you lied\n \n");
          System.out.println("Have you eaten your vegetables? (Y/N)");
          String input2 = getString();
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
    
    public static String getString() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            return s; 
        }
        catch(IOException ioe) {}
        return "";
    } 
}
