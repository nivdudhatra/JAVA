import java.util.*;

public class maxof3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter number 1:");
         
         int a = sc.nextInt();

         System.out.println("Enter number 2:");
         
         int b = sc.nextInt();

         System.out.println("Enter number 2:");
         
         int c = sc.nextInt();

           
         int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

         System.out.println(max + "Number is max");

        
    }
}