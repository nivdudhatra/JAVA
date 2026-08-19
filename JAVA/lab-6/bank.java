import java.util.*;

class BankDemo{

    Scanner sc = new Scanner(System.in);
    String  acc_type;
    int acc_no;
    double balance;
   

    public void setter()
    {
        System.out.println("Enter account number :");
        this.acc_no = sc.nextInt();

        System.out.println("Enter account type :");
        this.acc_type = sc.next();

        System.out.println("Enter Balance :");
        this.balance = sc.nextDouble();

      
    }

    public void getter()
    {
        System.out.println("Account number : "+acc_no);
        System.out.println("Account Type:"+acc_type);
        System.out.println("Account balance:"+balance);
        
    }
}


public class bank {
    public static void main(String[] args) {
        BankDemo b1 = new BankDemo();
        BankDemo b2 = new BankDemo();
        BankDemo b3 = new BankDemo();



        b1.setter();
        b1.getter();

        b2.setter();
        b2.getter();

        b3.setter();
        b3.getter();

    }
}
