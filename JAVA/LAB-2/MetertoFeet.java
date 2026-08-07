import java.util.*;

public class MetertoFeet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter Meter:");
         
         int m = sc.nextInt();

         
        double f = m * 3.28;

        System.out.println("Sum is :"+f);
    }
}