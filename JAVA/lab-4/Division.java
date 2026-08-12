import java.util.*;

public class Division
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mark");
        int mark = sc.nextInt();

        if (mark>=60) 
        {
            System.out.println("First Division");   
        }
        else if(mark>50 && mark<60)
        {
            System.out.println("Second Division");
        }
        else if(mark>40 && mark<50)
        {
            System.out.println("Third Division");
        }
        else 
        {
            System.out.println("Fail");
        }
    }
}