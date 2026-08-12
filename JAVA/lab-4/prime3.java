import java.util.*;

public class prime3 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter  3 digit Number");
        int num = sc.nextInt();
        int i,j;

        for(i=100 ; i<=999; i++)
        {
            for (int j = 2; j <= num / 2; j++) 
            {
                if (num % i == 0) 
                {
                    System.out.println("Number is not prime");
                    break;
                }
                else
                {
                    System.out.println("Number is  prime");
                    break;
                }
            }
        }

        
    }
}


