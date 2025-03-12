import java.util.Scanner;

public class emc3 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();        
        String address = scan.nextLine();
        System.out.println("My Name is "+name);
        System.out.println("My age is "+age);
        System.out.print("My Address is "+address);
    }
}

// Note:
//     1. scan is obeject_name most commonly used.
//     2. After int add scan.nextLine() in your next line to store the line created in your terminal.
//        (if you want to add String after int follow the above steps 2)
//     3.Println is to print in one full line.