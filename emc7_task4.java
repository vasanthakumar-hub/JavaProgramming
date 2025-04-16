import java.util.Scanner;

public class emc7_task4 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        String RCB = scan.nextLine();

        if (RCB.equals("win")) 
        {
           System.out.print("RCB Won This Match !"); 
        }
        else
        {
            System.out.print("RCB Lost");
        }
    }
    
}
