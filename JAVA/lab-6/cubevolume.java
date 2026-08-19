import java.util.*;

class Cube{

    Scanner sc = new Scanner(System.in);
    double hight;
    double withd;
    double depth;

    public void setter()
    {
        System.out.println("Enter hight :");
        this.hight = sc.nextDouble();

        System.out.println("Enter withd :");
        this.withd = sc.nextDouble();

        System.out.println("Enter depth :");
        this.depth = sc.nextDouble();

        
    }

    public void volume()
    {
        double volume;

        volume = hight*withd*depth;

        System.out.println("Volume is :"+volume);
    }
}

public class cubevolume {

     public static void main(String[] args) {
        
        Cube c1 = new Cube();
        Cube c2 = new Cube();

        c1.setter();
        c1.volume();

        c2.setter();
        c2.volume();
     }
}


