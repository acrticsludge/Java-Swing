import javax.swing.*;
import java.awt.*;
import java.util.*;
public class GUI1 {
    public static void main(String args[]) {
        JFrame frame = new JFrame(); // creates a JFrame Object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter true to open the application");
        boolean input1 = scanner.nextBoolean();
        if(input1 == true){
            System.out.println("Enter the x dimension of the ui");
            long dimensionsx = scanner.nextLong();
            System.out.println("Enter the y dimensions of the ui");
            long dimensionsy = scanner.nextLong();
            System.out.println("Enter the GUI tittle");
            String tittleName = scanner.nextLine();
            frame.setSize(420, 420);// sets the dimension of the frame
            frame.setTitle(tittleName);// sets the title of the frame 
            frame.setVisible(true);//Sets the ui visible
        }else{
         System.out.println("You have entered false, the program is stoping...");
         System.exit(0);// exits the program
        }
        
        

        
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //TODO: just hides the ui even when closed

    }
}