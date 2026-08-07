import java.util.*;

public class Sum
{
    public static void main(String[] args) 
    {
        System.out.println("Enter number 1:" + args[0]);
        System.out.println("Enter number 2:" + args[1]);

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        int total = x+y;


        System.out.println("Sum is :"+total);



        Scanner sc = new Scanner(System.in);

         System.out.println("Enter number 1:");
         
         int a = sc.nextInt();

         System.out.println("Enter number 2:");
         
         int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum is :"+sum);
    }
}