import java.util.Scanner;

public class emc6_equ {
    public static void main(String args[])
    {
        //Check Whether Number 1 and Number 2 is equal or not

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        // == is used as comparison operator whereas = is used to assign values to a variables
        if(num1==num2)
        {
          System.out.print("Both the Numbers are Equal");
        }
        else
        {
            System.out.print("Not Equal");
        }
    }  
}
