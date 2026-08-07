import java.util.*;

public class ChakeLetter
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter Char:");
         
         char ch = sc.next().charAt(0);
         char letter = Character.toLowerCase(ch);

         if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("Vowel");
             
         } else {
            System.out.println("constant");
         }


    }
}