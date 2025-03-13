import java.util.Scanner;

public class emc5 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double score = scan.nextDouble();
        scan.nextLine();
        String department = scan.nextLine();
        System.out.println("My Name is "+name);
        System.out.println("My Score is "+score/10+"/10");
        System.out.print("My Department is "+department);
    }
}

// Note:
//      1. double is used to store decimal values while int does not store decimal values