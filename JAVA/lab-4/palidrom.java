import java.util.*;

public class palidrom {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int number = sc.nextInt();
        int rev = 0;
        int num = number;

        while (num > 0) {
            int rem = num % 10; 
            rev = (rev * 10) + rem; 
            num = num / 10; 
        }


        if(rev == number)
        {
            System.out.println("Number is pelidrom");
        }
        else
        {
            System.out.println("Number is not pelidrom");
        }

    }
}
