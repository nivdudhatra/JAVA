import java.util.*;

class Student{

    Scanner sc = new Scanner(System.in);
    String  name;
    int roll_no;
    double spi;
    String course;

    public void setter()
    {
        System.out.println("Enter name :");
        this.name = sc.next();

        System.out.println("Enter Roll Number :");
        this.roll_no = sc.nextInt();

        System.out.println("Enter spi :");
        this.spi = sc.nextDouble();

        System.out.println("Enter Course :");
        this.course = sc.next();
    }

    public void getter()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll number:"+roll_no);
        System.out.println("Spi:"+spi);
        System.out.println("Course:"+course);
    }
}

public class Studentmethod {

    public static void main(String[] args) {

        
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();

    s1.setter();
    s1.getter();
    
    s2.setter();
    s2.getter();

    s3.setter();
    s3.getter();
        
    }



    
}
