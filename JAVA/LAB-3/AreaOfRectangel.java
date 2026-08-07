import java.util.*;

public class AreaOfRectangel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter Length:");
         
         int l = sc.nextInt();

         System.out.println("Enter Hight:");
         
         int h = sc.nextInt();

         
        int area = l*h;

        System.out.println("Sum is :"+ area);
    }
}