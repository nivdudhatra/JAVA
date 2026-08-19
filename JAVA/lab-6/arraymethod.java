import java.util.*;


class Arraycount {

    Scanner sc = new Scanner(System.in);


    int arr[] = new int[5];
    
    public void setter()
    {
         for (int i=0;i<5;i++)
         {
            System.out.println("Enter number of array");
            arr[i] = sc.nextInt();
         }

      
    }

    public void sortarray()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int k=0;k<5;k++)
        {
            System.out.println("array element is :"+arr[k]);
        }
    }
    
}



public class arraymethod {

    public static void main(String[] args) {
        
    }
    
}
