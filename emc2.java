import java.lang.System;
import java.util.Scanner;

public class emc2 {
    public static void main(String args[])
    {
        Scanner vasanth = new Scanner(System.in);
        int a = vasanth.nextInt();
        int b = vasanth.nextInt();
        vasanth.nextLine();
        String c = vasanth.nextLine();
        System.out.print(a+b);
        System.out.print(c);
        vasanth.close();
    }
}

// Note:
//     1.In java.lang package System is a class which is inbuilt in java package installation.
//     2.System.out is used to print output in a terminal. 
//       (We are Sending data from code to terminal using system).
//     3.System.in is used to get Input from a terminal.
//       (To Send data from terminal to code we need Scanner)