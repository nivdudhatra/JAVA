import java.util.*;

public class sumofarray {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter size of array");
         
         int n = sc.nextInt();

         int arr[] =  new int[n];

         int sum = 0;

         for (int i=0;i<n;i++)
         {
            System.out.println("Enter number of array");
            arr[i] = sc.nextInt();

            sum = sum + arr[i];
         }

         System.out.println("Sum is :"+sum);




    }
}