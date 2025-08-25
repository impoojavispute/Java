package Array;
import java.util.Scanner;

public class _5_ArraySearch 
{
    public static void main(String a[])
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter row :");
        int m = sc.nextInt();

        System.out.println("Enter Column :");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter Elements : ");
        
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = sc.nextInt();
                
            }
            
        }

        System.out.println("enter number to search :");
        int num = sc.nextInt();
        boolean x= false; //by default
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
               if(num==arr[i][j])
               {
                    System.out.println("Number found at position: (" + i + ", " + j + ")");
                    x=true;
               }

            }
             
            
        }
        if (!x) 
            {
                System.out.println("Not found");    
            }
       
            
        sc.close();

    }
}
