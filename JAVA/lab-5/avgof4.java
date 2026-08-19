import java.util.Scanner;

public class avgof4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int avg=0;

         int arr[] =  new int[4];

         int sum = 0;

         for (int i=0;i<4;i++)
         {
            System.out.println("Enter number of array");
            arr[i] = sc.nextInt();

            sum = sum + arr[i];
         }

         avg = sum /4;

         System.out.println("Sum is :"+sum);
         System.out.println("Avrage  is :"+avg);
    }
}
